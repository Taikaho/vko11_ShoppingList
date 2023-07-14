package olio_ohjelmointi_vko11.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private List list;
    private RecyclerView recyclerView;
    private EditText itemNameInput;

    private ItemListAdapter itemListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemNameInput = findViewById(R.id.txtInput);

        list = List.getInstance();

        recyclerView = findViewById(R.id.rvItemList);
        itemListAdapter = new ItemListAdapter(getApplicationContext(), list.getItems());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(itemListAdapter);
    }

    public void addItem(View view) {
        String itemNameString = itemNameInput.getText().toString();
        List.getInstance().addItem(itemNameString);
        itemListAdapter.notifyDataSetChanged();
        itemNameInput.setText("");
    }
}
