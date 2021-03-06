// Copyright 2015-present 650 Industries. All rights reserved.

package abi41_0_0.expo.modules.sensors.services;

import android.content.Context;
import android.hardware.Sensor;

import java.util.Collections;
import java.util.List;

import abi41_0_0.org.unimodules.core.interfaces.InternalModule;

public class LinearAccelerationSensorService extends SubscribableSensorService implements InternalModule, abi41_0_0.org.unimodules.interfaces.sensors.services.LinearAccelerationSensorService {
  public LinearAccelerationSensorService(Context reactContext) {
    super(reactContext);
  }

  @Override
  int getSensorType() {
    return Sensor.TYPE_LINEAR_ACCELERATION;
  }

  @Override
  public List<Class> getExportedInterfaces() {
    return Collections.<Class>singletonList(abi41_0_0.org.unimodules.interfaces.sensors.services.LinearAccelerationSensorService.class);
  }
}
