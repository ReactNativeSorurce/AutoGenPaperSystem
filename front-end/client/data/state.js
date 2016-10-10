const state = {
    "isFetching": false,
    "grades": [
        {
            "name": "高中",
            "courses": [
            {
                "context": "语文",
                "url": "yuwen"
            },
            {
                "context": "数学",
                "url": "yuwen"
            },
                        {
                "context": "英语",
                "url": "yuwen"
            },
                        {
                "context": "计算机",
                "url": "yuwen"
            }
            ]
        },
        {
            "name": "初中",
            "courses": [
                        {
                "context": "语文",
                "url": "yuwen"
            },            {
                "context": "数学",
                "url": "yuwen"
            },            {
                "context": "英语",
                "url": "yuwen"
            },            {
                "context": "计算机",
                "url": "yuwen"
            }
            ]
        }
    ],
    "selects": {
        "points": [
        {
            "name": "选择题",
            "url": "xuanze",
            "details": [
            {
                "name": "单选",
                "url": "danxuan",
                "details": []
            },
            {
                "name": "多选",
                "url": "duoxuan",
                "details": []
            }
            ]
        },
        {
            "name": "填空",
            "url": "tiankong",
            "details": []
        }
        ],
        "diffs": [
        {
            "name": "难",
            "url": "nan"
        },
        {
            "name": "易",
            "url": "yi"
        }
        ],
        "types": [
        {
            "name": "填空",
            "url": "tk"
        },
        {
            "name": "选择",
            "url": "xz"
        },
        ],
        "features": [
        {
            "name": "中国",
            "url": "cn"
        },
        {
            "name": "美国",
            "url": "us"
        },
        ]
    },
    "questions": {
        "contextLists": [
        {
            "id": 1,
            "context": "题目1",
            "answer": "答案1"
        },
                {
            "id": 2,
            "context": "题目2",
            "answer": "答案2"
        },
                {
            "id": 3,
            "context": "题目3",
            "answer": "答案3"
        }
        ],
        "id": 1,
        "count": 2
    }
};

export default state;