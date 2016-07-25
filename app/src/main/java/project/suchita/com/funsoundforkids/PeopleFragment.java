package project.suchita.com.funsoundforkids;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PeopleFragment extends Fragment implements View.OnClickListener {
MediaPlayer mediaPlayer;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_people_fragment, container, false);

        ImageView ivItalian = (ImageView) rootView.findViewById(R.id.ivItalian);
        ivItalian.setOnClickListener(this);
        ImageView ivJapanese = (ImageView) rootView.findViewById(R.id.ivJapanese);
        ivJapanese.setOnClickListener(this);
        ImageView ivFrench = (ImageView) rootView.findViewById(R.id.ivFrench);
        ivFrench.setOnClickListener(this);
        ImageView ivSpanish = (ImageView) rootView.findViewById(R.id.ivSpanish);
        ivSpanish.setOnClickListener(this);
        ImageView ivIndian = (ImageView) rootView.findViewById(R.id.ivIndian);
        ivIndian.setOnClickListener(this);
        ImageView ivGerman = (ImageView) rootView.findViewById(R.id.ivGerman);
        ivGerman.setOnClickListener(this);
        ImageView ivChinese = (ImageView) rootView.findViewById(R.id.ivChinese);
        ivChinese.setOnClickListener(this);
        ImageView ivAmerican = (ImageView) rootView.findViewById(R.id.ivAmerican);
        ivAmerican.setOnClickListener(this);
        ImageView ivKorean = (ImageView) rootView.findViewById(R.id.ivKorean);
        ivKorean.setOnClickListener(this);

        return rootView;
    }

    public void onClick(final View v) { //check for what button is pressed
        switch (v.getId()) {
            case R.id.ivItalian:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.italian_voice);
                mediaPlayer.start();
                break;
            case R.id.ivJapanese:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.japanese_voice);
                mediaPlayer.start();
                break;

            case R.id.ivFrench:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.french_voice);
                mediaPlayer.start();
                break;
            case R.id.ivSpanish:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.spanish_voice);
                mediaPlayer.start();
                break;
            case R.id.ivIndian:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.indian_voice);
                mediaPlayer.start();
                break;
            case R.id.ivGerman:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.german_voice);
                mediaPlayer.start();
                break;
            case R.id.ivChinese:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.chinese_voice);
                mediaPlayer.start();
                break;
            case R.id.ivAmerican:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.american_voice);
                mediaPlayer.start();
                break;
            case R.id.ivKorean:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.korean_voice);
                mediaPlayer.start();
                break;
            default:

                break;
        }

    }  }