package com.example.codeview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.example.codeview.R;
import com.example.codeview.adapter.HashTagAdapter;
import com.example.codeview.databinding.ActivityVideoBinding;
import com.example.codeview.model.hashtag.Datum;
import com.example.codeview.model.putmodel.Likeput;
import com.example.codeview.model.video.Data;
import com.example.codeview.model.video.VideoAcount;
import com.example.codeview.viewmodel.VideoUserViewModel;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;

import java.util.List;

public class VideoActivity extends AppCompatActivity {

    PlayerView playerView;
    ProgressBar progressBar;
    SimpleExoPlayer simpleExoPlayer;
    int k = 1;
private int g=0,h=0;
    private Handler handler;
    VideoUserViewModel videoUserViewModel;
    private String linkvideo;
    ActivityVideoBinding activityVideoBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        activityVideoBinding = DataBindingUtil.setContentView(this, R.layout.activity_video);

        activityVideoBinding.setVideoActivity(this);
        activityVideoBinding.setLifecycleOwner(this);

        videoUserViewModel = new ViewModelProviders().of(this).get(VideoUserViewModel.class);
        /// chuyền id =1;
        videoUserViewModel.getVideoAcount("1","3");
        videoUserViewModel.getChannelVideo("2");
        videoUserViewModel.getHashTag("2");

        playerView = findViewById(R.id.play_video);
        progressBar = findViewById(R.id.progress_bar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        LoadControl loadControl = new DefaultLoadControl();
        BandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
        TrackSelector trackSelector = new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(bandwidthMeter));
        simpleExoPlayer = ExoPlayerFactory.newSimpleInstance(VideoActivity.this, trackSelector, loadControl);


//        DefaultHttpDataSourceFactory factory = new DefaultHttpDataSourceFactory("exoplayer_video");
//        ExtractorsFactory extractorsFactory = new DefaultExtractorsFactory();
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changes();

                Uri videoUrl = Uri.parse("\"https://videocdn.bitel.com.pe/vcs_medias/video/20210525/9830/playlist_720.m3u8");

                MediaSource mediaSource = buildMediaSource(videoUrl);
                playerView.setPlayer(simpleExoPlayer);
                playerView.setKeepScreenOn(true);
                simpleExoPlayer.prepare(mediaSource);
                simpleExoPlayer.setPlayWhenReady(true);
            }
        }, 450);
        simpleExoPlayer.addListener(new Player.EventListener() {
            @Override
            public void onTimelineChanged(Timeline timeline, Object manifest, int reason) {

            }

            @Override
            public void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {

            }

            @Override
            public void onLoadingChanged(boolean isLoading) {

            }

            @Override
            public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
                if (playbackState == Player.STATE_BUFFERING) {
                    progressBar.setVisibility(View.VISIBLE);
                } else if (playbackState == Player.STATE_READY) {
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onRepeatModeChanged(int repeatMode) {

            }

            @Override
            public void onShuffleModeEnabledChanged(boolean shuffleModeEnabled) {

            }

            @Override
            public void onPlayerError(ExoPlaybackException error) {

            }

            @Override
            public void onPositionDiscontinuity(int reason) {

            }

            @Override
            public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {

            }

            @Override
            public void onSeekProcessed() {

            }

        });


    }

    private void changes() {

        videoUserViewModel.videoAcount12.observe(this, new Observer<VideoAcount>() {
            @Override
            public void onChanged(VideoAcount videoAcount) {
            setVideo(videoAcount.getData());
            if (videoAcount.getData().getLike()){
                setIsLike(1);
            }else setIsLike(0);

            }
        });
        videoUserViewModel.channel.observe(this, channel -> setChannel(channel.getData()));
        videoUserViewModel.hashTag.observe(this, hashTag -> setHashTagRecyclerview(hashTag.getData()));
    }


    public void setVideo(Data data) {
        linkvideo = data.getLinkVideo();
        activityVideoBinding.setVideoChannel(data);
    }
    public void setIsLike(int isLike){
        activityVideoBinding.setIsLike(isLike);
    }

    public void setChannel(com.example.codeview.model.channel.Data channel) {
        activityVideoBinding.setChannel(channel);
    }

    public void setHashTagRecyclerview(List<Datum> hashtag) {
        activityVideoBinding.setAdapter(new HashTagAdapter(this, hashtag));
    }

    private MediaSource buildMediaSource(Uri uri) {
        DataSource.Factory dataSourceFactory =
                new DefaultDataSourceFactory(this, "exoplayer-codelab");
        return new HlsMediaSource.Factory(dataSourceFactory)
                .createMediaSource(uri);
    }

    public void clickComment() {
        MyBottonSheetDialogFragment sheetDialogFragment = MyBottonSheetDialogFragment.newInstance();
        sheetDialogFragment.show(getSupportFragmentManager(), sheetDialogFragment.getTag());
        simpleExoPlayer.setPlayWhenReady(false);
        simpleExoPlayer.getPlaybackState();
    }

    public void clickBack() {
        onBackPressed();
    }

    public void clickLikevideo(){

        videoUserViewModel.videoAcount12.observe(this, new Observer<VideoAcount>() {
            @Override
            public void onChanged(VideoAcount videoAcount) {
                setVideo(videoAcount.getData());
                if(g<1){
                    if (videoAcount.getData().getLike()){
                        h=1;
                    }else h=0;

                }
                if(h==1){
                    videoUserViewModel.putLike(new Likeput(0,1,3));
                    setIsLike(0);
                    h=0;
                }else {
                    videoUserViewModel.putLike(new Likeput(1,1,3));
                    setIsLike(1);
                    h=1;

                }



            }
        });
g++;

    }

    @Override
    protected void onPause() {
        super.onPause();
        simpleExoPlayer.setPlayWhenReady(false);
        simpleExoPlayer.getPlaybackState();
        k = 2;

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        simpleExoPlayer.setPlayWhenReady(true);
        simpleExoPlayer.getPlaybackState();

    }
}