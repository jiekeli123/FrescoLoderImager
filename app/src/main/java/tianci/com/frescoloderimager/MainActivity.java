package tianci.com.frescoloderimager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bigkoo.convenientbanner.CBViewHolderCreator;
import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {
    private List<Integer> data = new ArrayList<>();
    private ConvenientBanner viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = (ConvenientBanner) findViewById(R.id.viewpager);
        initView();

    }
// wwwwwwwwww
    private void initView() {


        data.add(R.mipmap.ic_launcher);
        data.add(R.mipmap.ic_launcher);
        data.add(R.mipmap.ic_launcher);
        data.add(R.mipmap.ic_launcher);
        data.add(R.mipmap.ic_launcher);

        viewpager = (ConvenientBanner) findViewById(R.id.viewpager);
        viewpager.setPages(new CBViewHolderCreator() {
            @Override
            public Object createHolder() {

//我们需要实现一个Holder

                return new NetworkImageHolderView();
            }
        },data)
//设置我们现实的动画



                .setPageTransformer(ConvenientBanner.Transformer.AccordionTransformer)
                .startTurning(2000).setPageIndicator(new int[]{R.drawable.select,R.drawable.def})
                .setOnItemClickListener(this);    }




    @Override
    public void onItemClick(int position) {

    }




//    public class NetworkImageHolderView implements CBPageAdapter.Holder<Integer>  {
//
//        ImageView imageView;
//
//
//        public View createView(Context context) {
//            imageView = new ImageView(context);
//            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//            return imageView;
//        }
//
//
//        public void UpdateUI(Context context, int position, Integer data) {
//
//            imageView.setImageResource(data);
//
//        }
//    }




}
