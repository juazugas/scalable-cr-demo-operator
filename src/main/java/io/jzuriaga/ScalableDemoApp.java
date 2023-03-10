package io.jzuriaga;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Version("v1alpha1")
@Group("io.jzuriaga.jzuriaga.io")
public class ScalableDemoApp extends CustomResource<ScalableDemoAppSpec, ScalableDemoAppStatus> implements Namespaced {}

