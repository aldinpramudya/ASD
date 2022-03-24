public class Sum {
    int elemen[];
    double keuntungan[];
    double total;
    int perusahaan[];

    Sum(int elemen,int jumlah_perusahaan){
        this.elemen = new int [elemen];
        this.keuntungan = new double[elemen];
        this.perusahaan = new int [jumlah_perusahaan];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for(int i = 0; i < elemen.length ; i++ ){
            total += arr[i];
        }
        return total;   
    }

    double totalDC(double arr[], int l, int r){
        if(l == r){
            return arr[l];
        }
        else if (l<r){
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid-l);
            double rsum = totalDC(arr, mid+l,r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}
