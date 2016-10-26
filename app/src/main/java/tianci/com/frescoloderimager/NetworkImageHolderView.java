package tianci.com.frescoloderimager;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.CBPageAdapter;

/**
 * Created by Administrator on 2016/10/26.
 */
public class NetworkImageHolderView implements CBPageAdapter.Holder<Integer> {
    ImageView imageView;

    @Override
    public View createView(Context context) {
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    @Override
    public void UpdateUI(Context context, int position, Integer data) {

        imageView.setImageResource(data);

    }
}
