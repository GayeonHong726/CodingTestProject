package Python;

public class PCCE_5_8 {
//    5.
//    def solution(cpr):
//        answer = []
//        basic_order = ["check", "call", "pressure", "respiration", "repeat"]
//        for action in cpr:
//            for i in range(len(basic_order)) :
//                if action == basic_order[i] :
//                    answer.append(i+1)
//        return answer
//    6.
//    def solution(storage, usage, change):
//        total_usage = 0
//        for i in range(len(change)) :
//            usage = usage * (1+change[i]/100)
//            total_usage += usage # 총 사용량에 현재 사용량 추가
//            if total_usage > storage: # 총 사용량이 저장 용량 초과시
//                return i # 저장 용량 초과 순간 인덱스 반환
//        return -1
//    7.
//    def func1(num):
//        if 0 > num : # 0보다 작다면
//            return 0
//        else:
//            return num
//    def func2(num):
//        if num > 0:  # 0보다 크다면
//            return 0
//        else:
//            return num
//    def func3(station): # 내린 승객 수
//        num = 0
//		for people in station :
//            if people == "Off" :
//                num += 1
//        return num
//    def func4(station):  # 탑승한 승객 수
//        num = 0
//		for people in station :
//            if people == "On" :
//                num += 1
//        return num
//
//    def solution(seat, passengers):
//        num_passenger = 0 # 현재 탑승 승객
//		for station in passengers :
//            num_passenger += func4(station) # 탑승 승객 더하기
//            num_passenger -= func3(station) # 내린 승객 빼기
//            answer = func1(seat - num_passenger)
//		return answer
//    8.
//    def solution(nickname) :
//        answer = ""
//        for letter in nickname:
//            if letter == "l":
//                answer += "I"
//            elif letter == "W":
//                answer += "vv"
//            elif letter == "w":
//                answer += "vv"
//            elif letter == "O":
//                answer += "0"
//            else:
//                answer += letter
//		while len(answer) < 4 :
//            answer += "o"
//        if len(answer) > 8 :
//            answer += answer[:8] # 처음부터 8개 요소 반환
//		return answer
}
