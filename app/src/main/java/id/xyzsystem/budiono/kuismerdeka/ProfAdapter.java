package id.xyzsystem.budiono.kuismerdeka;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by budiono on 10/02/18.
 */
public class ProfAdapter extends RecyclerView.Adapter<ProfAdapter.MyViewHolder> {

    private List<ProfModel> profList;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nama;
        ImageView gambar;
        LinearLayout layout;

        public MyViewHolder(View itemView) {
            super(itemView);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);
            nama = (TextView) itemView.findViewById(R.id.nama);
            layout = (LinearLayout) itemView.findViewById(R.id.layout);
        }
    }

    public ProfAdapter(Context context, List<ProfModel>profList) {
        this.profList = profList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.activity_act_tujuh, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final ProfModel prof = profList.get(position);
        holder.nama.setText(prof.getEng());
        holder.gambar.setImageResource(prof.getGambar());
        holder.layout.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, prof.getIndo(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return profList.size();
    }
}