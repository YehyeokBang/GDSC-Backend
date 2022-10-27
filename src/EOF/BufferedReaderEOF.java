package EOF;

import java.io.*;

// BufferedReader 클래스를 이용해 EOF 확인하는 방법
public class BufferedReaderEOF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";

        while ((str = br.readLine()) != null) {
            bw.write(str + "\n");
        }
        // 컨트롤 + D로 파일의 끝을 알려주면 루프 탈출
        bw.write("BufferedReader EOF");
        bw.flush();
        bw.close();
        br.close();
    }
}
/*
    BufferedReader는 사용자가 요청할 때마다 데이터를 읽어오는 것이 아닌
    일정한 크기의 데이터를 한 번에 읽어와 버퍼에 보관 후 요청(flush)이 있을 때
    버퍼에서 데이터를 읽어오는 방식으로 동작함
*/
