import DecoratorPattern.*;
import ObserverDesignPattern.wheatherObservable;
import ObserverDesignPattern.wheatherObservableImpl;
import ObserverDesignPattern.wheatherObserver;
import ObserverDesignPattern.wheatherObserverImpl;
import ProxyDesignPattern.EmployeeDao;
import ProxyDesignPattern.EmployeeProxy;
import StrategyPattern.SportyDriveFunctionalityImpl;
import StrategyPattern.SportyVechicle;
import StrategyPattern.Vechicle;
import TicToe.TicToeGame;
import chainOfResponsibilityPatternLogger.DebugLogger;
import chainOfResponsibilityPatternLogger.ErrorLogger;
import chainOfResponsibilityPatternLogger.InfoLogger;

public class Main {
    public static void main(String[] args) {
          System.out.println("Hello world!");

//        SportyDriveFunctionalityImpl sportyDriveFunctionality = new SportyDriveFunctionalityImpl();
//        SportyVechicle sportyVechicle = new SportyVechicle(sportyDriveFunctionality);
//        sportyVechicle.drive();
        //ObserverPattern
//        wheatherObservable wheatherObservable = new wheatherObservableImpl();
//        wheatherObserver wheatherObserver = new wheatherObserverImpl(wheatherObservable);
//        wheatherObserver.setName("first");
//        wheatherObservable.add(wheatherObserver);
//
//        wheatherObservable.notify1();

//        AddTopping extraMushroom = new ExtraMushroom(new FarmHousePizza());
//        System.out.println(extraMushroom.cost());
//        ExtraMushroom extraMushroom1 = new ExtraChesseAndMushroom(new ExtraCheesse(new FarmHousePizza()));
//        System.out.println(extraMushroom1.cost());

        /*
        For Tic Toe game
         */
//        TicToeGame ticToeGame = new TicToeGame();
//        System.out.println(ticToeGame.startGame());

        /*
        for Logger----
         */

//        InfoLogger infoLogger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
//        infoLogger.log(1);
//        infoLogger.log(2);
//        infoLogger.log(3);
//        infoLogger.log(4);

        /*
        For Proxy Design Pattern
         */
        EmployeeDao employeeDao = new EmployeeProxy("dmin");
        employeeDao.create();




    }
}