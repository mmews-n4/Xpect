/*******************************************************************************
 * Copyright (c) 2012-2017 TypeFox GmbH and itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Moritz Eysholdt - Initial contribution and API
 *******************************************************************************/

package org.eclipse.xtext.example.arithmetics.xpect.tests.suite;

import org.eclipse.xtext.example.arithmetics.xpect.tests.interpreter.InterpreterTest;
import org.junit.runner.RunWith;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectSuiteClasses;
import org.xpect.runner.XpectTestFiles;
import org.xpect.runner.XpectTestFiles.FileRoot;
import org.xpect.xtext.lib.tests.JvmModelInferrerTest;
import org.xpect.xtext.lib.tests.LinkingTest;
import org.xpect.xtext.lib.tests.ResourceDescriptionTest;
import org.xpect.xtext.lib.tests.ScopingTest;
import org.xpect.xtext.lib.tests.ValidationTest;
import org.xpect.xtext.lib.tests.XtextTests;

@RunWith(XpectRunner.class)
@XpectSuiteClasses({ InterpreterTest.class, //
		JvmModelInferrerTest.class, //
		LinkingTest.class,//
		ResourceDescriptionTest.class, //
		ScopingTest.class, //
		ValidationTest.class, //
})
@XpectTestFiles(relativeTo = FileRoot.PROJECT, baseDir = "calc-tests")
public class ArithmeticsXtextTest extends XtextTests {

}
