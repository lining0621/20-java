@echo off
rem Copyright 1999-2018 Alibaba Group Holding Ltd.
rem Licensed under the Apache License, Version 2.0 (the "License");
rem you may not use this file except in compliance with the License.
rem You may obtain a copy of the License at
rem
rem      http://www.apache.org/licenses/LICENSE-2.0
rem
rem Unless required by applicable law or agreed to in writing, software
rem distributed under the License is distributed on an "AS IS" BASIS,
rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
rem See the License for the specific language governing permissions and
rem limitations under the License.

set RUN_TYPE=%1
set JAR_NAME=%2
set RUN_ENV=%3

if "%RUN_TYPE%" == "start" (
    echo "service starting ......"
    java -jar %JAR_NAME% --spring.profiles.active=%RUN_ENV%
)
if "%RUN_TYPE%" == "stop" (
    echo "service stoping ......"
)
if "%RUN_TYPE%" == "status" (
    echo "service status: "
)

pause>nul