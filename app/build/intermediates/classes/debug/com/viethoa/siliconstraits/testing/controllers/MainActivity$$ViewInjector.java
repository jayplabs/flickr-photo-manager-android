// Generated code from Butter Knife. Do not modify!
package com.viethoa.siliconstraits.testing.controllers;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.viethoa.siliconstraits.testing.controllers.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689560, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131689560, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131689563, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131689563, "field 'mRecyclerView'");
    view = finder.findRequiredView(source, 2131689562, "field 'refreshLayout'");
    target.refreshLayout = finder.castView(view, 2131689562, "field 'refreshLayout'");
    view = finder.findRequiredView(source, 2131689561, "field 'vNoDataView'");
    target.vNoDataView = view;
  }

  @Override public void reset(T target) {
    target.mToolbar = null;
    target.mRecyclerView = null;
    target.refreshLayout = null;
    target.vNoDataView = null;
  }
}
