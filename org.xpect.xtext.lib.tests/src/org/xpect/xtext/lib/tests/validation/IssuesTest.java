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

package org.xpect.xtext.lib.tests.validation;

import org.junit.runner.RunWith;
import org.xpect.XpectImport;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectSuiteClasses;
import org.xpect.xtext.lib.setup.XtextStandaloneSetup;
import org.xpect.xtext.lib.tests.ValidationTest;
import org.xpect.xtext.lib.tests.ValidationTestModuleSetup;

@RunWith(XpectRunner.class)
@XpectSuiteClasses({IssuesTest.class, ValidationTest.class})
@XpectImport({XtextStandaloneSetup.class, ValidationTestModuleSetup.class})
public class IssuesTest {

}
