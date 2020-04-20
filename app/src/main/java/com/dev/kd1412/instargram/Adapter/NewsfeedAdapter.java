package com.dev.kd1412.instargram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.kd1412.instargram.ItemClickListener;
import com.dev.kd1412.instargram.Model.Newsfeed;
import com.dev.kd1412.instargram.R;

import java.util.List;

public class NewsfeedAdapter extends RecyclerView.Adapter<NewsfeedAdapter.ViewHolder> {
    private List<Newsfeed> arrNewsfeed;
    private Context context;
    private int check = 0;

    public NewsfeedAdapter(List<Newsfeed> arrNewsfeed, Context context) {
        this.arrNewsfeed = arrNewsfeed;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Newsfeed newsfeed = arrNewsfeed.get(position);
        holder.imgAvt.setImageResource(R.drawable.avt);
        holder.imgContent.setImageResource(R.drawable.content);
        holder.tvName.setText(newsfeed.getUsername());
        holder.tvName1.setText(newsfeed.getUsername());
        holder.tvStatus.setText(newsfeed.getStatus());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void OnClick(View view, int position, boolean IsLongClick) {
                if (!IsLongClick) {
                    check++;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrNewsfeed.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ItemClickListener itemClickListener;
        TextView tvName, tvName1;
        TextView tvStatus;
        ImageView imgAvt;
        ImageView imgContent;
        Button btnLike;
        Button btnCmt;
        Button btnShare;

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_username);
            tvStatus = itemView.findViewById(R.id.tv_status);
            tvName1 = itemView.findViewById(R.id.tv_username1);
            imgAvt = itemView.findViewById(R.id.img_avt);
            imgContent = itemView.findViewById(R.id.img_content);
            btnLike = itemView.findViewById(R.id.btn_like);
            btnCmt = itemView.findViewById(R.id.btn_cmt);
            btnShare = itemView.findViewById(R.id.btn_share);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            itemClickListener.OnClick(v, getAdapterPosition(), false);
        }
    }

}
