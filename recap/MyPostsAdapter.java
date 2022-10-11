package com.example.recap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyPostsAdapter extends RecyclerView.Adapter<MyPostsAdapter.ViewHolder>{

    ArrayList<MyPostsData> myPostsData;
    Context context;

    public MyPostsAdapter(ArrayList<MyPostsData> myPostsData, Context context) {
        this.myPostsData = myPostsData;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.from(context).inflate(R.layout.posts_item_list, parent, false);
      //  ViewHolder viewHolder = new ViewHolder(view);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        MyPostsData myPostsDataList = myPostsData.get(position);

        holder.setUsername(myPostsDataList.getUser_name());
        holder.setMyPosts(myPostsDataList.getUser_posts());
        holder.setUserImage(myPostsDataList.getPhoto());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Toast.makeText(context, myPostsDataList.getUser_name(), Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return myPostsData == null ? 0 : myPostsData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView userImage;
        TextView username;
        TextView myPosts;


        public void setUserImage(Integer userImage) {
            this.userImage.setImageResource(userImage);
        }

        public void setUsername(String username) {
            this.username.setText(username);
        }

        public void setMyPosts(String myPosts) {
            this.myPosts.setText(myPosts);
        }

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.imageview);
            username = itemView.findViewById(R.id.userName);
            myPosts = itemView.findViewById(R.id.myPost);

        }
    }
}
