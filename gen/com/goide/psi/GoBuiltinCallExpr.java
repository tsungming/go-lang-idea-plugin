// This is a generated file. Not intended for manual editing.
package com.goide.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GoBuiltinCallExpr extends GoExpression {

  @Nullable
  GoBuiltinArgs getBuiltinArgs();

  @NotNull
  GoReferenceExpression getReferenceExpression();

  @Nullable
  PsiElement getComma();

  @NotNull
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

}
