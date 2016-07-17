/**
 * Created by riveramoreira on 7/11/16.
 */

var app = angular.module('myApp');

app.factory('userGet', function($http){
    var getData =function(email) {
        console.log('in factory');
        return $http({
            method: 'GET',
            url: 'ClickBankJob/email/' + email
        })

    };

    return {
        getData : getData
    }
})

app.factory('userLogin', function($http){
    var login = function(email, password){
        console.log('in factory login');
        return $http({
            method: 'GET',
            url: '/ClickBankJob/login/' + email + '/' + password
        })
    };
    return {
        login : login
    }
})

app.factory('makeBricksFactory', function($http){
    var makeBricks = function(big, small, goal){
        console.log('in makebricks factory ' + big + ' ' + small + ' ' + goal);
        return $http({
            method: 'GET',
            url: '/ClickBankJob/makebricks/'+ big + '/' + small + '/' + goal
        })
    };
    return{
        makeBricks : makeBricks
    }
})

app.factory('linearInFactory', function($http){
    var linearIn = function(outerStr, innerStr){
        console.log('in linear factory');

        return $http({
            method: 'GET',
            url: '/ClickBankJob/linearin/' + outerStr + '/' + innerStr
        })
    };
    return{
        linearIn : linearIn
    }
})

app.factory('bunnyEarsFactory', function($http){
    var bunnyEars = function(bunnies){
        console.log('in bunny ears factory');

        return $http({
            method: 'GET',
            url: '/ClickBankJob/bunnyears/' + bunnies
        })
    };
    return{
        bunnyEars : bunnyEars
    }
})

app.factory('withoutStringFactory', function($http){
    var withoutString = function(base, remove){
        console.log('in without string factory');

        return $http({
            method: 'GET',
            url: '/ClickBankJob/withoutstring/' + base + '/' + remove
        })
    };
    return{
        withoutString : withoutString
    }
})

app.factory('lastTwoFactory', function($http){
    var lastTwo = function(str){
        return $http({
            method: 'GET',
            url: '/ClickBankJob/lasttwo/' + str
        })
    };
    return{
        lastTwo : lastTwo
    }
})