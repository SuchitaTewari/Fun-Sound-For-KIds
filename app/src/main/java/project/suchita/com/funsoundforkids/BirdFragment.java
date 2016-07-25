package project.suchita.com.funsoundforkids;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BirdFragment extends Fragment implements View.OnClickListener {
MediaPlayer mediaPlayer;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_bird_fragment, container, false);
        ImageView ivDuck = (ImageView) rootView.findViewById(R.id.ivDuck);
        ivDuck.setOnClickListener(this);
        ImageView ivPeacock = (ImageView) rootView.findViewById(R.id.ivPeacock);
        ivPeacock.setOnClickListener(this);
        ImageView ivOwl = (ImageView) rootView.findViewById(R.id.ivOwl);
        ivOwl.setOnClickListener(this);
        ImageView ivParrot = (ImageView) rootView.findViewById(R.id.ivParrot);
        ivParrot.setOnClickListener(this);
        ImageView ivHen = (ImageView) rootView.findViewById(R.id.ivHen);
        ivHen.setOnClickListener(this);
        ImageView ivPigeon = (ImageView) rootView.findViewById(R.id.ivPigeon);
        ivPigeon.setOnClickListener(this);
        ImageView ivEagle = (ImageView) rootView.findViewById(R.id.ivEagle);
        ivEagle.setOnClickListener(this);
        ImageView ivSparrow = (ImageView) rootView.findViewById(R.id.ivSparrow);
        ivSparrow.setOnClickListener(this);
        final ImageView ivCrow = (ImageView) rootView.findViewById(R.id.ivCrow);
        ivCrow.setOnClickListener(this);

        return rootView;
    }

    public void onClick(final View v) { //check for what button is pressed
        switch (v.getId()) {
            case R.id.ivDuck:
                mediaPlayer=MediaPlayer.create(getActivity(), R.raw.duck);
                mediaPlayer.start();
                break;
            case R.id.ivPeacock:
                mediaPlayer=MediaPlayer.create(getActivity(), R.raw.peacock);
                mediaPlayer.start();
                break;

            case R.id.ivOwl:
                mediaPlayer=MediaPlayer.create(getActivity(), R.raw.owl);
                mediaPlayer.start();
                break;
            case R.id.ivParrot:
                mediaPlayer=MediaPlayer.create(getActivity(), R.raw.parrot);
                mediaPlayer.start();
                break;
            case R.id.ivHen:
                mediaPlayer=MediaPlayer.create(getActivity(), R.raw.hen);
                mediaPlayer.start();
                break;
            case R.id.ivPigeon:
                mediaPlayer=MediaPlayer.create(getActivity(), R.raw.pigeon);
                mediaPlayer.start();
                break;
            case R.id.ivEagle:
                mediaPlayer=MediaPlayer.create(getActivity(), R.raw.eagle);
                mediaPlayer.start();
                break;
            case R.id.ivSparrow:
                mediaPlayer=MediaPlayer.create(getActivity(), R.raw.sparrow);
                mediaPlayer.start();
                break;
            case R.id.ivCrow:
                mediaPlayer=MediaPlayer.create(getActivity(), R.raw.crow);
                mediaPlayer.start();
                break;
            default:

                break;
        }

    }
}
