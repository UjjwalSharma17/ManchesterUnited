package com.example.android.manchesterunited;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by ujjwal on 05-01-2017.
 */

public class PlayerAdapter extends ArrayAdapter<Player>{

    int mPrimaryColor;
    int mPrimaryColorDark;

    public PlayerAdapter(Context context, ArrayList<Player> playerArrayList, int primaryColor,int primaryColorDark){
        super(context, 0, playerArrayList);
        mPrimaryColorDark = primaryColorDark;
        mPrimaryColor = primaryColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Player currentPlayer = getItem(position);

        TextView playerName = (TextView) listItemView.findViewById(R.id.player_name);
        TextView nationality = (TextView) listItemView.findViewById(R.id.nationality);

        playerName.setText(currentPlayer.getPlayerName());
        nationality.setText(currentPlayer.getNationality());

        ImageView playerImage = (ImageView) listItemView.findViewById(R.id.player_image);
        playerImage.setImageResource(currentPlayer.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color;
        if(position % 2 == 0){
            color = ContextCompat.getColor(getContext(), mPrimaryColor);
        }
        else{
            color = ContextCompat.getColor(getContext(), mPrimaryColorDark);
        }
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}





