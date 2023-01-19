package io.jzuriaga;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

public class ScalableDemoAppReconciler implements Reconciler<ScalableDemoApp> { 
  private final KubernetesClient client;

  public ScalableDemoAppReconciler(KubernetesClient client) {
    this.client = client;
  }

  // TODO Fill in the rest of the reconciler

  @Override
  public UpdateControl<ScalableDemoApp> reconcile(ScalableDemoApp resource, Context context) {
    // TODO: fill in logic

    return UpdateControl.noUpdate();
  }
}

