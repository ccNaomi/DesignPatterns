/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package lab1.model;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Paragraph {
  private String text;

  public Paragraph(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "Paragraph [text=" + text + "]";
  }

}
