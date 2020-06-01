/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class OrientationsReference extends ReferenceRotation {
  private transient long swigCPtr;

  public OrientationsReference(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.OrientationsReference_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(OrientationsReference obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_OrientationsReference(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static OrientationsReference safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.OrientationsReference_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new OrientationsReference(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.OrientationsReference_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.OrientationsReference_getClassName();
  }

  public OpenSimObject unused_clone() {
    long cPtr = opensimSimulationJNI.OrientationsReference_unused_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new OrientationsReference(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.OrientationsReference_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_orientation_file(OrientationsReference source) {
    opensimSimulationJNI.OrientationsReference_copyProperty_orientation_file(swigCPtr, this, OrientationsReference.getCPtr(source), source);
  }

  public String get_orientation_file(int i) {
    return opensimSimulationJNI.OrientationsReference_get_orientation_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_orientation_file(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.OrientationsReference_upd_orientation_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation_file(int i, String value) {
    opensimSimulationJNI.OrientationsReference_set_orientation_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_orientation_file(String value) {
    return opensimSimulationJNI.OrientationsReference_append_orientation_file(swigCPtr, this, value);
  }

  public void constructProperty_orientation_file(String initValue) {
    opensimSimulationJNI.OrientationsReference_constructProperty_orientation_file(swigCPtr, this, initValue);
  }

  public String get_orientation_file() {
    return opensimSimulationJNI.OrientationsReference_get_orientation_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_orientation_file() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.OrientationsReference_upd_orientation_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation_file(String value) {
    opensimSimulationJNI.OrientationsReference_set_orientation_file__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_orientation_weights(OrientationsReference source) {
    opensimSimulationJNI.OrientationsReference_copyProperty_orientation_weights(swigCPtr, this, OrientationsReference.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t get_orientation_weights(int i) {
    return new SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t(opensimSimulationJNI.OrientationsReference_get_orientation_weights__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t upd_orientation_weights(int i) {
    return new SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t(opensimSimulationJNI.OrientationsReference_upd_orientation_weights__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation_weights(int i, SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t value) {
    opensimSimulationJNI.OrientationsReference_set_orientation_weights__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t.getCPtr(value));
  }

  public int append_orientation_weights(SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t value) {
    return opensimSimulationJNI.OrientationsReference_append_orientation_weights(swigCPtr, this, SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t.getCPtr(value));
  }

  public void constructProperty_orientation_weights(SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t initValue) {
    opensimSimulationJNI.OrientationsReference_constructProperty_orientation_weights(swigCPtr, this, SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t.getCPtr(initValue));
  }

  public SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t get_orientation_weights() {
    return new SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t(opensimSimulationJNI.OrientationsReference_get_orientation_weights__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t upd_orientation_weights() {
    return new SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t(opensimSimulationJNI.OrientationsReference_upd_orientation_weights__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation_weights(SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t value) {
    opensimSimulationJNI.OrientationsReference_set_orientation_weights__SWIG_1(swigCPtr, this, SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t.getCPtr(value));
  }

  public void copyProperty_default_weight(OrientationsReference source) {
    opensimSimulationJNI.OrientationsReference_copyProperty_default_weight(swigCPtr, this, OrientationsReference.getCPtr(source), source);
  }

  public double get_default_weight(int i) {
    return opensimSimulationJNI.OrientationsReference_get_default_weight__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_default_weight(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.OrientationsReference_upd_default_weight__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_default_weight(int i, double value) {
    opensimSimulationJNI.OrientationsReference_set_default_weight__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_default_weight(double value) {
    return opensimSimulationJNI.OrientationsReference_append_default_weight(swigCPtr, this, value);
  }

  public void constructProperty_default_weight(double initValue) {
    opensimSimulationJNI.OrientationsReference_constructProperty_default_weight(swigCPtr, this, initValue);
  }

  public double get_default_weight() {
    return opensimSimulationJNI.OrientationsReference_get_default_weight__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_default_weight() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.OrientationsReference_upd_default_weight__SWIG_1(swigCPtr, this), false);
  }

  public void set_default_weight(double value) {
    opensimSimulationJNI.OrientationsReference_set_default_weight__SWIG_1(swigCPtr, this, value);
  }

  public OrientationsReference() {
    this(opensimSimulationJNI.new_OrientationsReference__SWIG_0(), true);
  }

  public OrientationsReference(String orientationFileName, Units modelUnits) {
    this(opensimSimulationJNI.new_OrientationsReference__SWIG_1(orientationFileName, Units.getCPtr(modelUnits), modelUnits), true);
  }

  public OrientationsReference(String orientationFileName) {
    this(opensimSimulationJNI.new_OrientationsReference__SWIG_2(orientationFileName), true);
  }

  public OrientationsReference(TimeSeriesTableRotation orientationData, SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t orientationWeightSet) {
    this(opensimSimulationJNI.new_OrientationsReference__SWIG_3(TimeSeriesTableRotation.getCPtr(orientationData), orientationData, SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t.getCPtr(orientationWeightSet)), true);
  }

  public OrientationsReference(TimeSeriesTableRotation orientationData) {
    this(opensimSimulationJNI.new_OrientationsReference__SWIG_4(TimeSeriesTableRotation.getCPtr(orientationData), orientationData), true);
  }

  public void loadOrientationsEulerAnglesFile(String eulerAnglesXYZ, Units modelUnits) {
    opensimSimulationJNI.OrientationsReference_loadOrientationsEulerAnglesFile__SWIG_0(swigCPtr, this, eulerAnglesXYZ, Units.getCPtr(modelUnits), modelUnits);
  }

  public void loadOrientationsEulerAnglesFile(String eulerAnglesXYZ) {
    opensimSimulationJNI.OrientationsReference_loadOrientationsEulerAnglesFile__SWIG_1(swigCPtr, this, eulerAnglesXYZ);
  }

  public int getNumRefs() {
    return opensimSimulationJNI.OrientationsReference_getNumRefs(swigCPtr, this);
  }

  public Vec2 getValidTimeRange() {
    return new Vec2(opensimSimulationJNI.OrientationsReference_getValidTimeRange(swigCPtr, this), true);
  }

  public StdVectorDouble getTimes() {
    return new StdVectorDouble(opensimSimulationJNI.OrientationsReference_getTimes(swigCPtr, this), false);
  }

  public SimTKArrayString getNames() {
    return new SimTKArrayString(opensimSimulationJNI.OrientationsReference_getNames(swigCPtr, this), false);
  }

  public void getValues(State s, SimTKArrayRotation values) {
    opensimSimulationJNI.OrientationsReference_getValues(swigCPtr, this, State.getCPtr(s), s, SimTKArrayRotation.getCPtr(values), values);
  }

  public void getWeights(State s, SimTKArrayDouble weights) {
    opensimSimulationJNI.OrientationsReference_getWeights(swigCPtr, this, State.getCPtr(s), s, SimTKArrayDouble.getCPtr(weights), weights);
  }

  public double getSamplingFrequency() {
    return opensimSimulationJNI.OrientationsReference_getSamplingFrequency(swigCPtr, this);
  }

  public SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t updOrientationWeightSet() {
    return new SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t(opensimSimulationJNI.OrientationsReference_updOrientationWeightSet(swigCPtr, this), false);
  }

  public void setOrientationWeightSet(SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t orientationWeights) {
    opensimSimulationJNI.OrientationsReference_setOrientationWeightSet(swigCPtr, this, SWIGTYPE_p_OpenSim__SetT_OpenSim__OrientationWeight_OpenSim__Object_t.getCPtr(orientationWeights));
  }

  public void setDefaultWeight(double weight) {
    opensimSimulationJNI.OrientationsReference_setDefaultWeight(swigCPtr, this, weight);
  }

}