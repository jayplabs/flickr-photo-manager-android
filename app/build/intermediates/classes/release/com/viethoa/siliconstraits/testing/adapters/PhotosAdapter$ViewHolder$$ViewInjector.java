// Generated code from Butter Knife. Do not modify!
package com.viethoa.siliconstraits.testing.adapters;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class PhotosAdapter$ViewHolder$$ViewInjector<T extends com.viethoa.siliconstraits.testing.adapters.PhotosAdapter.ViewHolder> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689586, "field 'ivPhotoHolder'");
    target.ivPhotoHolder = finder.castView(view, 2131689586, "field 'ivPhotoHolder'");
    view = finder.findRequiredView(source, 2131689588, "field 'ivPhoto'");
    target.ivPhoto = finder.castView(view, 2131689588, "field 'ivPhoto'");
    view = finder.findRequiredView(source, 2131689595, "field 'btnLike'");
    target.btnLike = finder.castView(view, 2131689595, "field 'btnLike'");
    view = finder.findRequiredView(source, 2131689597, "field 'switFavorite'");
    target.switFavorite = finder.castView(view, 2131689597, "field 'switFavorite'");
  }

  @Override public void reset(T target) {
    target.ivPhotoHolder = null;
    target.ivPhoto = null;
    target.btnLike = null;
    target.switFavorite = null;
  }
}
