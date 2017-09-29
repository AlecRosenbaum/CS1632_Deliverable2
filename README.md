# CS 1632 - DELIVERABLE 2: Unit Testing CitySim9005

Written By: Alec Rosenbaum
Available At: https://github.com/AlecRosenbaum/CS1632_Deliverable2

The only issue faces when writing unit tests, were the ability to mock/force protected instance attributes. To work around this, I made getter methods for each attribute in that class, which could then be stubbed.

No tests are failing.

`test.sh` executes all tests in RoadTest, DriverTest, and LocationTest. Executing `test.sh` yields:
```
$ ./test.sh

ALL TESTS PASSED
```
