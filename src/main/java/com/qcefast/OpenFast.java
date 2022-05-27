/*
 *  (C) Copyright 2022 Quart Consulting Services, LLC (https://qcefast.com/)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.qcefast;

import com.qcefast.starter.FastStarter;

import java.io.IOException;

public class OpenFast {

	/**
	 * The entry point of application.
	 * Example input:
	 * <br>
	 * --fastRunConfig FastRunConfig/fast-runconfig.properties --envRunConfig EnvRunConfig/env-runconfig.properties --testDriverRunConfig TestDriverRunConfig/test-driver-runconfig.properties
	 * <br>
	 * Usage: <br>
	 *   --callerIdentity (a string; default: ""): <br>
	 *     The directory of the caller-identity.json file the notificationService will use to sendStatuses <br>
	 *   --envRunConfig (a string; default: ""): <br>
	 *     The full path to a envRunConfig properties file <br>
	 *   --fastRunConfig (a string; default: ""): <br>
	 *     The full path to a fastRunConfig properties file <br>
	 *   --testDriverRunConfig (a string; default: ""): <br>
	 *     The full path to a testDriverRunConfig properites file <br>
	 * @param args the input arguments
	 * @throws IOException the io exception
	 * @since 1.0.0
	 */
	public static void main(String[] args) throws IOException {
		FastStarter.main(args);
	}
	
}
