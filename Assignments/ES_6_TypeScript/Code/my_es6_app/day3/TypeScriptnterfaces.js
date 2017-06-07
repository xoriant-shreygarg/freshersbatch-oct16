"use strict";
exports.__esModule = true;
var circle = {
    print: function () { return console.log("Circle printed "); }
};
var employee = {
    print: function () { return console.log("Employee printed "); }
};
function printAll(objects) {
    for (var _i = 0, objects_1 = objects; _i < objects_1.length; _i++) {
        var obj = objects_1[_i];
        obj.print();
    }
}
exports.printAll = printAll;
function f2() {
    printAll([circle, employee, circle, employee]);
}
exports.f2 = f2;
