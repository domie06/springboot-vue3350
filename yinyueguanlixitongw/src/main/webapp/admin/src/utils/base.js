const base = {
    get() {
        return {
            url : "http://localhost:8080/yinyueguanlixitongw/",
            name: "yinyueguanlixitongw",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yinyueguanlixitongw/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "音乐管理系统"
        } 
    }
}
export default base
