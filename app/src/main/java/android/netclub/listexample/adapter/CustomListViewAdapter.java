package android.netclub.listexample.adapter;

import android.content.Context;
import android.netclub.listexample.R;
import android.netclub.listexample.model.User;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by usernames on 26/11/16.
 */

public class CustomListViewAdapter extends ArrayAdapter<User> {
    public CustomListViewAdapter(Context context, List<User> users) {
        super(context, R.layout.card_user, users);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.card_user, parent,false);

        User user = getItem(position);
        TextView tvUser = (TextView) customView.findViewById(R.id.tv_user);
        ImageView ivUser = (ImageView) customView.findViewById(R.id.iv_user);

        String name = user.getName();
        int avatar = user.getAvatar();

        tvUser.setText(name);
        ivUser.setImageResource(avatar);

        return customView;
    }
}
