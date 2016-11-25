package android.netclub.listexample.adapter;

import android.content.Context;
import android.netclub.listexample.R;
import android.netclub.listexample.model.User;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usernames on 26/11/16.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.UserViewHolder> {

    Context context;
    List<User> users = new ArrayList<>();

    public RecyclerViewAdapter(Context context, List<User> users) {
        this.users = users;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{

        private CardView cvUser;
        private TextView tvUser;
        private ImageView ivUser;

        public UserViewHolder(View itemView) {
            super(itemView);
            cvUser = (CardView)  itemView.findViewById(R.id.cv_user);
            tvUser = (TextView) itemView.findViewById(R.id.tv_user);
            ivUser = (ImageView) itemView.findViewById(R.id.iv_user);
        }
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View customView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_user, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(customView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        final String name = users.get(position).getName();
        int avatar =users.get(position).getAvatar();

        holder.tvUser.setText(name);
        holder.ivUser.setImageResource(avatar);

        holder.cvUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Person : " + name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return users == null ? 0 : users.size();
    }

}
