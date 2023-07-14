package olio_ohjelmointi_vko11.shoppinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private Context context;
    private ArrayList<Item> items = new ArrayList<>();

    public ItemListAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.itemName.setText(items.get(position).getItemName());
        holder.editName.setText(items.get(position).getItemName());

        holder.btnRemove.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();
            List.getInstance().removeItem(items.get(pos).getItemName());
            notifyItemRemoved(pos);
        });


        holder.btnEdit.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();
            if (holder.editName.getVisibility() == View.VISIBLE){
                Item item = List.getInstance().getItemByName(String.valueOf(pos));
                item.setItemName(holder.editName.getText().toString());
                holder.editName.setVisibility(View.GONE);
                notifyDataSetChanged();

            }
            else {
                holder.editName.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
