/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ComponentIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ComponentIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(ComponentIterator other) {
    return opensimCommonJNI.ComponentIterator_equals(swigCPtr, this, ComponentIterator.getCPtr(other), other);
  }

  public Component __ref__() {
    return new Component(opensimCommonJNI.ComponentIterator___ref__(swigCPtr, this), false);
  }

  public Component __deref__() {
    long cPtr = opensimCommonJNI.ComponentIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Component(cPtr, false);
  }

  public ComponentIterator next() {
    return new ComponentIterator(opensimCommonJNI.ComponentIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.ComponentIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Component(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.ComponentIterator_getConcreteClassName(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimCommonJNI.ComponentIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimCommonJNI.ComponentIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimCommonJNI.ComponentIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimCommonJNI.ComponentIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimCommonJNI.ComponentIterator_hasSystem(swigCPtr, this);
  }

  public String getAbsolutePathName() {
    return opensimCommonJNI.ComponentIterator_getAbsolutePathName(swigCPtr, this);
  }

  public String getRelativePathName(Component wrt) {
    return opensimCommonJNI.ComponentIterator_getRelativePathName(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public boolean hasComponent(String pathname) {
    return opensimCommonJNI.ComponentIterator_hasComponent(swigCPtr, this, pathname);
  }

  public Component getComponent(String pathname) {
    return new Component(opensimCommonJNI.ComponentIterator_getComponent(swigCPtr, this, pathname), false);
  }

  public long printComponentsMatching(String substring) {
    return opensimCommonJNI.ComponentIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimCommonJNI.ComponentIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimCommonJNI.ComponentIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumSockets() {
    return opensimCommonJNI.ComponentIterator_getNumSockets(swigCPtr, this);
  }

  public OpenSimObject getConnectee(String name) {
    return new OpenSimObject(opensimCommonJNI.ComponentIterator_getConnectee(swigCPtr, this, name), false);
  }

  public AbstractSocket getSocket(String name) {
    return new AbstractSocket(opensimCommonJNI.ComponentIterator_getSocket(swigCPtr, this, name), false);
  }

  public int getNumInputs() {
    return opensimCommonJNI.ComponentIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimCommonJNI.ComponentIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getInputNames() {
    return new StdVectorString(opensimCommonJNI.ComponentIterator_getInputNames(swigCPtr, this), true);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimCommonJNI.ComponentIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimCommonJNI.ComponentIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimCommonJNI.ComponentIterator_getOutput(swigCPtr, this, name), false);
  }

  public int getModelingOption(State state, String name) {
    return opensimCommonJNI.ComponentIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimCommonJNI.ComponentIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimCommonJNI.ComponentIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimCommonJNI.ComponentIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimCommonJNI.ComponentIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public void setStateVariableValues(State state, Vector values) {
    opensimCommonJNI.ComponentIterator_setStateVariableValues(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(values), values);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimCommonJNI.ComponentIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimCommonJNI.ComponentIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimCommonJNI.ComponentIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimCommonJNI.ComponentIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimCommonJNI.ComponentIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimCommonJNI.ComponentIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void printSubcomponentInfo() {
    opensimCommonJNI.ComponentIterator_printSubcomponentInfo(swigCPtr, this);
  }

  public void printSocketInfo() {
    opensimCommonJNI.ComponentIterator_printSocketInfo(swigCPtr, this);
  }

  public void printInputInfo() {
    opensimCommonJNI.ComponentIterator_printInputInfo(swigCPtr, this);
  }

  public void printOutputInfo(boolean includeDescendants) {
    opensimCommonJNI.ComponentIterator_printOutputInfo__SWIG_0(swigCPtr, this, includeDescendants);
  }

  public void printOutputInfo() {
    opensimCommonJNI.ComponentIterator_printOutputInfo__SWIG_1(swigCPtr, this);
  }

  public Component getOwner() {
    return new Component(opensimCommonJNI.ComponentIterator_getOwner(swigCPtr, this), false);
  }

  public boolean hasOwner() {
    return opensimCommonJNI.ComponentIterator_hasOwner(swigCPtr, this);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimCommonJNI.ComponentIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimCommonJNI.ComponentIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimCommonJNI.ComponentIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimCommonJNI.ComponentIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimCommonJNI.ComponentIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimCommonJNI.ComponentIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimCommonJNI.ComponentIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimCommonJNI.ComponentIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimCommonJNI.ComponentIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimCommonJNI.ComponentIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimCommonJNI.ComponentIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimCommonJNI.ComponentIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimCommonJNI.ComponentIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimCommonJNI.ComponentIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimCommonJNI.ComponentIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimCommonJNI.ComponentIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimCommonJNI.ComponentIterator_toString(swigCPtr, this);
  }

}
