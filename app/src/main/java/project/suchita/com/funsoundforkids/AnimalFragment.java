package project.suchita.com.funsoundforkids;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AnimalFragment extends Fragment implements View.OnClickListener{
    MediaPlayer mediaPlayer;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_animal_fragment, container, false);

        ImageView ivCat = (ImageView) rootView.findViewById(R.id.ivCat);
        ivCat.setOnClickListener(this);
        ImageView ivBear = (ImageView) rootView.findViewById(R.id.ivBear);
        ivBear.setOnClickListener(this);
        ImageView ivMonkey = (ImageView) rootView.findViewById(R.id.ivMonkey);
        ivMonkey.setOnClickListener(this);
        ImageView ivHorse = (ImageView) rootView.findViewById(R.id.ivHorse);
        ivHorse.setOnClickListener(this);
        ImageView ivDog = (ImageView) rootView.findViewById(R.id.ivDog);
        ivDog.setOnClickListener(this);
        ImageView ivElephant = (ImageView) rootView.findViewById(R.id.ivElephant);
        ivElephant.setOnClickListener(this);
        ImageView ivCow = (ImageView) rootView.findViewById(R.id.ivCow);
        ivCow.setOnClickListener(this);
        ImageView ivLion = (ImageView) rootView.findViewById(R.id.ivLion);
        ivLion.setOnClickListener(this);
        ImageView ivSheep = (ImageView) rootView.findViewById(R.id.ivSheep);
        ivSheep.setOnClickListener(this);

        return rootView;
    }

    public void onClick(final View v) { //check for what button is pressed
        switch (v.getId()) {
            case R.id.ivCat:
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
                    mediaPlayer.start();
                }else{
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
                break;
            case R.id.ivBear:
                if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.bear);
                mediaPlayer.start();
                }else{
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
                break;

            case R.id.ivMonkey:
                if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.monkey);
                mediaPlayer.start();
                }else{
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
                break;
            case R.id.ivHorse:
                if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.horse);
                mediaPlayer.start();
                }else{
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
                break;
            case R.id.ivDog:
                if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
                mediaPlayer.start();
                }else{
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
                break;
            case R.id.ivElephant:
                if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.elephant);
                mediaPlayer.start();
                }else{
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
                break;
            case R.id.ivCow:
                if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
                mediaPlayer.start();
                }else{
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
                break;
            case R.id.ivLion:
                if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
                mediaPlayer.start();
                }else{
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
                break;
            case R.id.ivSheep:
                if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
                mediaPlayer.start();
                }else{
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
                break;
            default:

                break;
        }

  }  }