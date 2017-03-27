/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetConstraints extends SetConstraints {
  private transient long swigCPtr;

  public ModelComponentSetConstraints(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponentSetConstraints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetConstraints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponentSetConstraints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetConstraints safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponentSetConstraints_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetConstraints(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponentSetConstraints_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponentSetConstraints_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponentSetConstraints_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetConstraints(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponentSetConstraints_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetConstraints() {
    this(opensimSimulationJNI.new_ModelComponentSetConstraints__SWIG_0(), true);
  }

  public ModelComponentSetConstraints(Model model) {
    this(opensimSimulationJNI.new_ModelComponentSetConstraints__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetConstraints(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_ModelComponentSetConstraints__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetConstraints(Model model, String fileName) {
    this(opensimSimulationJNI.new_ModelComponentSetConstraints__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetConstraints(ModelComponentSetConstraints source) {
    this(opensimSimulationJNI.new_ModelComponentSetConstraints__SWIG_4(ModelComponentSetConstraints.getCPtr(source), source), true);
  }

  public boolean hasModel() {
    return opensimSimulationJNI.ModelComponentSetConstraints_hasModel(swigCPtr, this);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.ModelComponentSetConstraints_getModel(swigCPtr, this), false);
  }

  public Model updModel() {
    return new Model(opensimSimulationJNI.ModelComponentSetConstraints_updModel(swigCPtr, this), false);
  }

  public void setModel(Model model) {
    opensimSimulationJNI.ModelComponentSetConstraints_setModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public boolean insert(int aIndex, Constraint aObject) {
    return opensimSimulationJNI.ModelComponentSetConstraints_insert(swigCPtr, this, aIndex, Constraint.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Constraint aObject, boolean preserveGroups) {
    return opensimSimulationJNI.ModelComponentSetConstraints_set__SWIG_0(swigCPtr, this, aIndex, Constraint.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Constraint aObject) {
    return opensimSimulationJNI.ModelComponentSetConstraints_set__SWIG_1(swigCPtr, this, aIndex, Constraint.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimSimulationJNI.ModelComponentSetConstraints_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeInitStateFromProperties(State state) {
    opensimSimulationJNI.ModelComponentSetConstraints_invokeInitStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeSetPropertiesFromState(State state) {
    opensimSimulationJNI.ModelComponentSetConstraints_invokeSetPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.ModelComponentSetConstraints_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
