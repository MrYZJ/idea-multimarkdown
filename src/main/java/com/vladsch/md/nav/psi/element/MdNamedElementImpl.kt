// Copyright (c) 2015-2020 Vladimir Schneider <vladimir.schneider@gmail.com> Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.vladsch.md.nav.psi.element

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElementVisitor

abstract class MdNamedElementImpl(node: ASTNode) : MdRenameElementImpl(node), MdNamedElement {

    override fun accept(visitor: PsiElementVisitor) {
        if (visitor is MdPsiVisitor)
            visitor.visitNamedElement(this)
        else
            super.accept(visitor)
    }
}
