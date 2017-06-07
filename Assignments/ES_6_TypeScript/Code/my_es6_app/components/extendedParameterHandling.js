export function add(x=10,y=20){
    return a+b;
}

export function userFriends(user, ...userFriends){
    console.log(userFriends.map(userFriend=>{return userFriend + " is a friend of " + user}));
}

export function printCapitalNames(a,b,c,d,e){
    console.log(a+b+c+d+e);
}