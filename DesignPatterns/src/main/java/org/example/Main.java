package org.example;

import org.example.BehavioralPatterns.ChainOfResponsibility.EventChain;
import org.example.BehavioralPatterns.CommandPattern.Commands.AttackCommand;
import org.example.BehavioralPatterns.CommandPattern.Commands.MoveCommand;
import org.example.BehavioralPatterns.CommandPattern.Sergeant;
import org.example.BehavioralPatterns.CommandPattern.Soldier;
import org.example.BehavioralPatterns.CommandPattern.Tank;
import org.example.BehavioralPatterns.Iterator.Iterator;
import org.example.BehavioralPatterns.Iterator.TestAgregate;
import org.example.BehavioralPatterns.Mediator.*;
import org.example.BehavioralPatterns.Memento.Example.TextEditor;
import org.example.BehavioralPatterns.Memento.Example.TextWindow;
import org.example.BehavioralPatterns.ObserverPattern.*;
import org.example.BehavioralPatterns.StatePattern.Human;
import org.example.BehavioralPatterns.StatePattern.Paula;
import org.example.BehavioralPatterns.StatePattern.States.StateFactory;
import org.example.BehavioralPatterns.StrategyPattern.Bunny;
import org.example.BehavioralPatterns.StrategyPattern.Dog;
import org.example.BehavioralPatterns.StrategyPattern.RennVerhalten.GeradeausRennen;
import org.example.BehavioralPatterns.StrategyPattern.RennVerhalten.ImKreisRennen;
import org.example.BehavioralPatterns.StrategyPattern.RennVerhalten.ZickZackRennen;
import org.example.BehavioralPatterns.StrategyPattern.Springverhalten.HochSpringen;
import org.example.BehavioralPatterns.StrategyPattern.Springverhalten.HochWeitSpringen;
import org.example.BehavioralPatterns.StrategyPattern.Springverhalten.WeitSpringen;
import org.example.BehavioralPatterns.VisitorPattern.LearJet;
import org.example.BehavioralPatterns.VisitorPattern.Visitor.TitleFormatter;
import org.example.CreationalPattern.AbstractFactory.AirCraftFactory;
import org.example.CreationalPattern.BuilderPattern.Desert;
import org.example.CreationalPattern.BuilderPattern.Entry;
import org.example.CreationalPattern.BuilderPattern.MainCourse;
import org.example.CreationalPattern.BuilderPattern.Meal;
import org.example.CreationalPattern.Prototype.MarbleTable;
import org.example.CreationalPattern.Singelton.AnderesUnikat;
import org.example.CreationalPattern.Singelton.Unikat;
import org.example.StructuralPattern.Adapter.CelsiusThermometer;
import org.example.StructuralPattern.Adapter.FahrenheitAdapter;
import org.example.StructuralPattern.Bridge.Fruits.Apple;
import org.example.StructuralPattern.Bridge.Fruits.PineApple;
import org.example.StructuralPattern.Bridge.Juice.JuiceImpl;
import org.example.StructuralPattern.Composite.*;
import org.example.StructuralPattern.Decorator_Wrapper.BlueDress;
import org.example.StructuralPattern.Decorator_Wrapper.FemaleDoll;
import org.example.StructuralPattern.Decorator_Wrapper.RedDress;
import org.example.StructuralPattern.Facade.*;
import org.example.StructuralPattern.Facade.CoffeeMachine.Coffee;
import org.example.StructuralPattern.Flyweight.Pixel.Pixel;
import org.example.StructuralPattern.Flyweight.Pixel.PixelFactory;
import org.example.StructuralPattern.Proxy.Proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Abstract Factory
        /*
         * 1. Isolierung konkreter Klassen. Die AbstrakcFactory ist nicht nur für die Erzeugung von Instanzen,
         * der in ihr hinterlegten Klassen zuständig, sondern Kapselt diese auch entsprechend.
         * Implementierungsdetails der einzelnen Objekte, bleiben somit verborgen.
         * 2.einzelne Factories lassen sich einfach austauschen.
         * 3.sorgt für Produktkonsistenz und das die einzelnen Objekte zu einer Familie gehören.
         *Nachteil:
         *  4. Unterstützung neuer Produktarten ist schwieriger umzusetzen, da hier eine Erweiterung der Factory-Schnittstelle benötigt wird.
         * */

        AirCraftFactory.getInstance().example();

        newLine();
        //BuilderPattern
        /*
         * 1. Das Builder-Pattern ermöglicht es, die Implementierungs- und Erzeugungsdetails eines (insbesondere eines komplexen) Objektes nach außen zu verbergen.
         * 2. Durch das Builder-Pattern können die verschiedenen Schritte in abhängigkeit verschiedener anderer Prozesse durchgeführt werden,
         * und somit das Objekt stückweise aufgebaut werden.
         * */

        Meal.Builder builder = new Meal.Builder();
        Meal meal = builder
                .setName("SteakMenu")
                .setEntry(new Entry("PotatoeSoup", true))
                .setMainCourse(new MainCourse("SteakMenu", false, 1300))
                .setDesert(new Desert("ChoclatePudding", true, 650))
                .build();
        System.out.println(meal);

        newLine();

        //Prototype Pattern
        /*
         *1. Prototype Pattern soll die komplexität des erzeugens eines Objektes vereinfachen.
         * Es hat eine gewisse Ähnlichkeit mit dem Builder Pattern.
         * 2. Das Pattern eignet sich besonders für die Erzeugung von Objekten zur Laufzeit.
         * 3. Reduziert das Subclassing
         * Nachteil:
         * Wenn ein internes Objekt kein Kopieren unterschüzt.
         * Gr0ßer Aufwand beo Tiefen Kopien
         * */

        MarbleTable table = new MarbleTable(10, 10, "schwarz");
        MarbleTable tableCopy = (MarbleTable) table.copy();
        System.out.println("Original: " + table + " Copy: " + tableCopy);

        newLine();

        //Singelton Pattern
        /*
         * 1. Sicherstellung einer einzigen Instanz des Objekts in der Anwendung
         * und somit den Zugriff auf Ressourcen.
         * 2. Eingeschränkter Namensraum vermindert Bezeichnungskollision
         * 3. Kann durch Unterklassenbildung erweitert oder spezialisiert werden.

         * */

        Unikat.getInstance().accessMessage();

        AnderesUnikat.getInstance().accessMessage();

        // Adapter Pattern
        /*
        1. Stellt Kompabilität zwischen Klassen her, die voneinander Unabhängig sind und bleiben sollen.

        * */
        CelsiusThermometer thermometer = new CelsiusThermometer();

        FahrenheitAdapter adapter = new FahrenheitAdapter(thermometer);
        System.out.println("Thermometer: " + thermometer.getCelsius() + " Adapter: " + adapter.getFahrenheit());

        newLine();

        // Bridge Pattern
        /*
        1. Entkopplung von Schnittstelle und Implementierung
        2. Bessere erweiterbarkeit
        3. Verbergen der Implementierungsdetails vor dem Client
        * */
        new JuiceImpl(new Apple()).getFlavor();
        new JuiceImpl(new PineApple()).getFlavor();
        new JuiceImpl(() -> {
            System.out.println("Tastes like strawberry-mint");
        }).getFlavor();
        //
        newLine();

        // Composite Pattern
        /*
         *
         * 1. Representation von verschachtelten Strukturen, wie zum Beispiel im Tree format
         * 2. Dank der Komponentenschnittstelle ist der Client von einer konkreten Implementierung
         * entkoppelt und stützt sich allein auf Abstraktion.
         * 3. Flexibilität und Erweiterbarkeit.
         * 4. Teilweise schwierige Definition der notwendigen gemeinsamkeiten der Schnittstelle
         * 5. Nachträgliche Einschränkung der verschiedenen Typen gestaltet sich schwierig
         * */

        Composite root = new Division("Head");
        Composite FinanceDepartment = new Department("Fincance");
        Composite StaffDepartment = new Department("Staff");
        root.add(FinanceDepartment);
        root.add(StaffDepartment);
        FinanceDepartment.add(new Employee("Müller"));
        FinanceDepartment.add(new Employee("Panzer"));
        FinanceDepartment.add(new Leaf() {
            @Override
            public String getName() {
                return "Meier";
            }

            @Override
            public String getDescription() {
                return "Putze";
            }

            @Override
            public void operation() {
                System.out.println("Ich bin ein Zeitarbeiter! Meine Name ist Meier");
            }
        });

        StaffDepartment.add(new Employee("Knauserig"));
        StaffDepartment.add(new Employee("Unhöflich"));

        root.operation();

        newLine();

        // Decorator Pattern
        /*
        1. Hinzufügen von Verhalten ohne Vererbung einer Klasse, besitzt aber die gleiche Schnittstelle.
        2. Eignet sich zum Hinzufügen aber auch Entfernen (Kapselung) von Eigenschaften.
        3. Vorteile: Transparenz, Flexibilität, Performance und Flexibilität.
        4. Nachteile: Schwere Fehlerfindung und hohe Objektzahl, keine Objektidentität.
         * */
        RedDress redDress = new RedDress(new FemaleDoll());
        BlueDress blueDress = new BlueDress(new FemaleDoll());
        System.out.println(redDress.dress());
        System.out.println(blueDress.dress());

        newLine();

        // Facade
        /*
        1. Vereinfachte Schnittstelle, der Anwender muss die einzelnen Klassen und ihr Zusammenspiel nicht kennen.
        2. Einzelne Komponenten des Subsystems können ausgetauscht werden ohne, dass sich für die Anwendungsschnittstelle etwas ändert.
        * */
        CoffeeMachine_Facade coffeeMachineFacade = new CoffeeMachine_Facade();
        Coffee coffee = coffeeMachineFacade.makeCoffee();
        System.out.println(coffee.getType() + " " + coffee.drinkCoffee());

        newLine();
        // Flyweight Pattern
        /*
        1. Nützlich für die reduzierung von Speicherplatz durch die Wiederverwendung von Objekten
        2. Ähnlich einer Factory, nur mit Cache.
        * */
        String[] colors = new String[]{"Black", "White", "Red", "Green", "Blue"};

        for (int i = 0; i < 1024; i++) {
            String color = colors[(int) (Math.random() * colors.length)];

            Pixel pixel = PixelFactory.getInstance().getPixel(color);

            //System.out.println(pixel.getColor());

        }

        System.out.println("Reused Pixel count: " + PixelFactory.getInstance().reusedPixel());
        System.out.println("Created " + (1024 - PixelFactory.getInstance().reusedPixel()) + " new PixelObject");

        newLine();

        // Proxy Pattern
        /*
        1. Das Proxy Pattern kann im Remote use verbergen, dass diese sich in einem anderen Adressbereich befindet. -> Java RMI
        2. Ein Proxy kann durch Caching und lazy loading Ressourcen einsparen.
        3. Kann den Zugriff auf Ressourcen steuern und unterbinden.
        * */
        new Proxy().connectTo("abc.com");
        new Proxy().connectTo("Hello-World.com");

        newLine();

        //Chain of Responsebility
        /*
         * 1. Der Request ist entkoppelt und muss nicht wissen, welche Requesthandler implementiert sind.
         * 2. Das entgegennehmende Objekt muss nur eine referenz auf den nächsten Handler kennen.
         * 3. Hohe flexibilität bei der zuweisung von zuständigkeiten.
         * 4. Eignet sich gut, um Prozesse abzubilden.
         * */

        new EventChain().process("MouseEvent");

        newLine();
        // Command Pattern
        /*
        1. Das CommandPattern ermöglicht die Modularisierung von Befehlen und Aufrufen.
        2. Durch das CommandPattern kann eine Historie sowie undo Operationen implementiert werden.
        3. Befehls Empfang und Ausführung können voneinander entkoppelt werden.
        * */
        Sergeant sergeant = new Sergeant();
        MoveCommand moveCommand = new MoveCommand(new Soldier());
        AttackCommand attackCommand = new AttackCommand(new Tank());
        sergeant.giveOrder(moveCommand);
        sergeant.giveOrder(attackCommand);
        sergeant.cancelLastOrder();


        newLine();

        // Interpreter Pattern
        /*
         * */


        //Iterator Pattern
        /*
        1. Unterstützt verschiedene Traversierungsvarianten.
         Objekte und Collectionen auf verschieden Arten durchlaufen werden.
        2. Vereinfachte Handhabung durch einheitliche Schnittstelle.
        3. Verschiedene Traversierungsvorgänge parallel möglich.

        * */

        TestAgregate testAgregate = new TestAgregate();
        testAgregate.setFirstValue("Hello,");
        testAgregate.setSecondValue("How are ");
        testAgregate.setThirdValue("You");

        Iterator<String> iterator = testAgregate.getIterator(testAgregate);
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
        iterator.next();

        newLine();

        // MediatorPattern
       /*
       1. Ein Mediator steuert das Verhalten mehrere Objekte lokailisert.
       2. Ein Mediator entkoppelt damit verschieden Objekte voneinander.
       3. Somit wird auch die Objektkontrolle vereinfacht.
       4. Höhere Transparenz bei der Objektinteraktion
       5. Nachteil ist jedoch, dass die Komplexität des Mediator Objektes
       mit der zunahme von Funktionen steigt.
            * */

        Mediator mediator = new Mediator();
        SubMenuA subMenuA = new SubMenuOne(mediator);
        SubMenuB subMenuB = new SubMenuTwo(mediator);
        mediator.setSubMenuOne(subMenuA);
        mediator.setSubMenuTwo(subMenuB);
        Widget widget = new Widget(mediator);
        widget.onClickButtonOne();
        widget.onClickButtonTwo();

        newLine();

        // Memento
        /*
        1. Dient dem Zwischenspeichern von Objektzuständen, ohne die Kapselung der Objekte zu beeinträchtigen.
        2. Das Memento Objekt kann aufwendig in der Verwaltung werden.
        3. Dieses Pattern kann ggf. großen speicherbedarf bekommen.
        * */

        TextEditor textEditor = new TextEditor();
        textEditor.write("Hallo World");
        textEditor.write("\n");
        textEditor.write("How are You?");
        textEditor.saveState();
        textEditor.write("fine");
        textEditor.undo();
        textEditor.print();

        newLine();

        //Observer Pattern
        /*
        1. Eignet sich, um die Zustandsveränderung an mehrere andere Objekte zu übermitteln.
        2. Entkoppel die Objekte voneinander. Objekt auf verschiedenen schichten können ebenfalls miteinander kommunizieren.
        3. Sender muss empfänger nicht kennen.
        4. Welche zustände genau geändert wurden, ist dem Empfänger ggf. nicht bekannt.
        5. kleine Mitteilungen können bereits zu großem 'traffic' führen, da Sender vom vorgang des observers entkoppelt ist.
        * */

        Observer<StateOfObject> observer = new StateChangedObserver();
        ObjectWithState objectWithState = new ObjectWithState();
        objectWithState.setObserver(observer);

        observer.attach(new ObjectWhoListens());
        observer.attach(new ObjectWhoListens());

        objectWithState.setState("Hello World");

        newLine();

        //
        /*
        1. speziefische Verhaltensweisen werden auf verschieden Zustände verteilt.
        Diese können hierdurch leicht ergänzt oder ausgetauscht werden.
        2. Nachteil hierbei ist jedoch, dass das Verhalten auf verschieden State klassen verteilt ist
        und somit, gerade bei den Status übergängen, schnell die Übersicht verloren geht.
        3. Zustandsänderungen sind für das entsprechende Objekt leichter Nachvollziehbarer,
        da nur eine variable benötigt wird;
        4. Ggf. können zustandsobjekte wiederverwendet oder gemeinsam genutzt werden. -> FlyweightPattern
        */
        Paula paula = new Paula();
        paula.setStateOfMind(StateFactory.getInstance().getNeutralState(paula));
        paula.conversate();
        paula.makeCompliment();
        paula.touch();

        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1 - 4 for conversation. Enter Bye to close");

        while (true) {
            String line = input.nextLine();
            if ("Bye".equalsIgnoreCase(line.trim())) {
                break;
            }
            switch (line.trim()) {
                case "1":
                    paula.conversate();
                    break;
                case "2":
                    paula.insult();
                    break;
                case "3":
                    paula.touch();
                    break;
                case "4":
                    paula.makeCompliment();
                    break;
                default:{System.out.println("Wrong input");}
            }
        }
        */

        newLine();

         //StrategyPattern
        /*
        1. Das Strategy Pattern stellt eine Alternative zur Unterklassenbildung dar.
        2. Wiederverwendbarkeit und Entkopplung von Objekt und Verhalten. -> StatePattern.
        2. Der Context arbeitet dabei nicht mit einer konkreten Implementierung,
        sondern mit einer Schnittstelle. Er ist damit implementierungsunabhängig und kann somit mit neuen Verhalten ausgestattet werden,
        ohne dass sein Code dafür geändert werden muss.
        3. Dynamisches Verhalten und reduzierung von Bedingungen.
        4. Anwender muss Strategy kennen.
        5. Es kann zu unnötiger Kommunikation und Datentransfer zwischen Context und Strategie kommen,
        wenn die im Interface definierte Methode eine Reihe von Parametern entgegennimmt, die aber gar nicht von allen Strategien verarbeitet werden.
        * */
        Bunny bunny = new Bunny();
        bunny.setSpringVerhalten(new WeitSpringen());
        bunny.setRennVerhalten(new ZickZackRennen());
        bunny.hoppel();
        bunny.huepfe();

        Dog dog = new Dog();
        dog.setRennVerhalten(new GeradeausRennen());
        dog.setSpringVerhalten(new HochSpringen());
        dog.renne();
        dog.jump();
        dog.setRennVerhalten(new ImKreisRennen());
        dog.renne();

        bunny.setSpringVerhalten(new HochWeitSpringen());
        bunny.huepfe();

        newLine();
        // Template Method;
        /*
        1. Nutzt vererbung, um entsprechende Schnittstellen zu implementieren oder nicht.
        * */


        // Visitor Pattern
        /*
        1 Das Visitor Pattern erleichter das Hinzufügen neuer (komplexerer) Funktionen.
        2. Das Pattern vereinfacht die Trennung von ähnlichen und unähnlichen Code.
        3. Das Hinzufügen oder erweitern mit konkreten Klassen ist schwierig,
       der visitor muss immer um die entsprechenden Operationen erweitert werden.
       Die Frage wie geeignet das Visitor pattern ist, entscheidet sich daran wie häufig die operationen verändert oder erweitert werden müssen.
       4. Bei unterschiedlichen benötigten Objekttypen funktioniert diese pattern nicht.
        * */
        LearJet learJet = new LearJet("Boing SV32");
        TitleFormatter titleFormatter = new TitleFormatter();
        String name =  learJet.accept(titleFormatter);
        System.out.println(name);

        newLine();


    }

    private static void newLine(){
        System.out.println();
    }

}