package sysproj.seonjoon.twice.view.custom;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import sysproj.seonjoon.twice.entity.Post;
import sysproj.seonjoon.twice.viewholder.BaseViewHolder;
import sysproj.seonjoon.twice.viewholder.ViewHolderFactory;

public class TimelineRecyclerAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private static final String TAG = "TimeRecyclerAdapter";
    private Context context;
    private ArrayList<Post> items;

    public TimelineRecyclerAdapter(Context context, ArrayList<Post> items) {
        super();
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // TODO : Viewholder Connect

        int resId = ViewHolderFactory.getLayoutResId(viewType);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(resId, parent, false);
        BaseViewHolder viewHolder = ViewHolderFactory.getViewHolder(view, viewType);

        return viewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder viewHolder, int position) {
        viewHolder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

}
