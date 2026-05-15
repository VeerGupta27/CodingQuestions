/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    let n= functions.length;

    return function(x) {
      
    if(n== 0){
        return x;
    }
    let temp= x;

    for(let i= n-1; i>=0; i--){
        temp=(functions[i](temp));
    }
    return temp;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */