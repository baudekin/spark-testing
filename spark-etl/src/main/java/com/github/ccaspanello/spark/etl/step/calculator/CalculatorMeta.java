package com.github.ccaspanello.spark.etl.step.calculator;

import com.github.ccaspanello.spark.etl.step.BaseStepMeta;

/**
 * Calculator Step Meta-data
 *
 * Created by ccaspanello on 1/29/18.
 */
public class CalculatorMeta extends BaseStepMeta {

  private String columnName;
  private CalcFunction calcFunction;
  private String fieldA;
  private String fieldB;

  //<editor-fold desc="Getters & Setters">
  public CalculatorMeta( String name ) {
    super( name );
  }

  public CalcFunction getCalcFunction() {
    return calcFunction;
  }

  public void setCalcFunction( CalcFunction calcFunction ) {
    this.calcFunction = calcFunction;
  }

  public String getFieldA() {
    return fieldA;
  }

  public void setFieldA( String fieldA ) {
    this.fieldA = fieldA;
  }

  public String getFieldB() {
    return fieldB;
  }

  public void setFieldB( String fieldB ) {
    this.fieldB = fieldB;
  }

  public String getColumnName() {
    return columnName;
  }

  public void setColumnName( String columnName ) {
    this.columnName = columnName;
  }
  //</editor-fold>

}
