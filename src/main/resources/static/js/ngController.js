/**
 * Created by riveramoreira on 7/11/16.
 */

var app = angular.module('myApp');

app.controller('userController', function($scope, userGet, userLogin, makeBricksFactory,
                                          linearInFactory, bunnyEarsFactory, withoutStringFactory,
                                          lastTwoFactory){
    $scope.data = [];
    
    $scope.lookUpByEmail = function(email){
        userGet.getData(email)
            .then(function(response){
                $scope.user = response.data;
            });
    }

    $scope.logIn = function(email, password){
        userLogin.login(email, password)
            .then(function(response){
                $scope.userLoggedIn = response.data;
            });
    }

    $scope.makeBricks = function(big, small, goal){
        makeBricksFactory.makeBricks(big, small, goal)
            .then(function(response){
                $scope.makeBricksResult = response.data;
            })
    }
    
    $scope.linearIn = function(outerStr, innerStr){
        linearInFactory.linearIn(outerStr, innerStr)
            .then(function(response){
                $scope.linearInResult = response.data;
            })
    }

    $scope.bunnyEars = function(bunnies){
        bunnyEarsFactory.bunnyEars(bunnies)
            .then(function(response){
                $scope.bunnyEarsResult = response.data;
            })
    }

    $scope.withoutString = function(base, remove){
        withoutStringFactory.withoutString(base, remove)
            .then(function(response){
                $scope.withoutStringResult = response.data;
            })
    }

    $scope.lastTwo = function(str){
        lastTwoFactory.lastTwo(str)
            .then(function(response){
                $scope.lastTwoResult = response.data;
            })
    }
    

});

