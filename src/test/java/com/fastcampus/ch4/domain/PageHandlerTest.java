//package com.fastcampus.ch4.domain;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class PageHandlerTest {
//
//    @Test
//    public void test(){
//        PageHandler ph = new PageHandler( 250, 1); // 페이지는 총 250개가 있고 beginPage는 1, endPage는 10, prev 버튼 안보임
//        ph.print();
//        System.out.println("ph = " + ph);
//        assertTrue(ph.getBeginPage() ==1);
//        assertTrue(ph.getEndPage() ==10);
//    }
//
//    @Test
//    public void test2(){
//        PageHandler ph = new PageHandler( 250, 11); // 페이지는 총 250개가 있고 beginPage는 1, endPage는 10, prev 버튼 안보임
//        ph.print();
//        System.out.println("ph = " + ph);
//        assertTrue(ph.getBeginPage() ==11);
//        assertTrue(ph.getEndPage() ==20);
//    }
//
//    @Test
//    public void test3(){
//        PageHandler ph = new PageHandler( 255, 25); // 페이지는 총 250개가 있고 beginPage는 1, endPage는 10, prev 버튼 안보임
//        ph.print();
//        System.out.println("ph = " + ph);
//        assertTrue(ph.getBeginPage() ==21);
//        assertTrue(ph.getEndPage() ==26);
//    }
//
//    @Test
//    public void test4(){
//        PageHandler ph = new PageHandler( 255, 10); // 페이지는 총 250개가 있고 beginPage는 1, endPage는 10, prev 버튼 안보임
//        ph.print();
//        System.out.println("ph = " + ph);
//        assertTrue(ph.getBeginPage() ==1);
//        assertTrue(ph.getEndPage() ==10);
//    }
//    // 테스트할때 경계가 되는 부분 맨 앞과 맨뒤 테스트를 잘해야한다
//}