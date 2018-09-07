 public static void InsertionSort(int[] arr) 
    { 

        for (int i = 1; i <arr.length ; i++) 
        { 
            int el = arr[i]; 
            int cursor = i; 
            while(cursor>=1 && el<arr[cursor-1]) 
            { 
                arr[cursor] = arr[cursor-1]; 
                cursor--; 
            } 
            arr[cursor] = el; 
        } 

    } 

    public static void Swap(int i,int j,int[] arr) 
    { 
        int temp = arr[i]; 
        arr[i]=arr[j]; 
        arr[j]=temp; 
    } 

 

 