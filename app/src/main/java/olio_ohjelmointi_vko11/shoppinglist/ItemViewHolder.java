package olio_ohjelmointi_vko11.shoppinglist;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView itemName;
    ImageView btnRemove, btnEdit;
    EditText editName, nameInput;


    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        itemName = itemView.findViewById(R.id.txtItem);
        btnRemove = itemView.findViewById(R.id.btnRemove);
        btnEdit = itemView.findViewById(R.id.btnEdit);
        editName = itemView.findViewById(R.id.editName);
        nameInput = itemView.findViewById(R.id.txtInput);


    }
}

