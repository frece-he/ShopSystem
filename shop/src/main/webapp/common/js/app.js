// Declare app level module
var myApp = angular.module('myApp', ['ngRoute', 'ngResource',  'ngSanitize', 'ui.grid',
	'ui.grid.expandable', 'ui.grid.pinning', 'ui.grid.pagination', 'ui.grid.selection', 'ui.grid.edit',
	'ui.grid.rowEdit', 'ui.grid.cellNav', 'ui.grid.autoResize', 'ui.grid.resizeColumns', 'ui.select',
	'angular-popups']);
myApp.config(['$routeProvider', function($routeProvider) {

	//默认登录
	$routeProvider.when('/', {
		templateUrl : 'mainpage/login/template/login.html',
		controller : 'loginController'
	});

	$routeProvider.otherwise({
		templateUrl : 'mainpage/login/template/login.html',
		controller : 'loginController'
	});


}]);

myApp.config(function($httpProvider) {
	$httpProvider.defaults.headers.put['Content-Type'] = 'application/x-www-form-urlencoded';
	$httpProvider.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';

	// Override $http service's default transformRequest
	$httpProvider.defaults.transformRequest = [function(data) {
		/**
		 * The workhorse; converts an object to x-www-form-urlencoded serialization.
		 * @param {Object} obj
		 * @return {String}
		 */
		var param = function(obj) {
			var query = '';
			var name, value, fullSubName, subName, subValue, innerObj, i;

			for (name in obj) {
				value = obj[name];

				if (value instanceof Array) {
					for (i = 0; i < value.length; ++i) {
						subValue = value[i];
						fullSubName = name + '[' + i + ']';
						innerObj = {};
						innerObj[fullSubName] = subValue;
						query += param(innerObj) + '&';
					}
				} else if (value instanceof Object) {
					for (subName in value) {
						subValue = value[subName];
						fullSubName = name + '[' + subName + ']';
						innerObj = {};
						innerObj[fullSubName] = subValue;
						query += param(innerObj) + '&';
					}
				} else if (value !== undefined && value !== null) {
					query += encodeURIComponent(name) + '='
							+ encodeURIComponent(value) + '&';
				}
			}

			return query.length ? query.substr(0, query.length - 1) : query;
		};

		return angular.isObject(data) && String(data) !== '[object File]'
				? param(data)
				: data;
	}];
});



