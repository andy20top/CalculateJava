public class Controller <T extends Model> {
    T model;
    View view;

    public Controller(T model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int choice;
        double result = 0;
        Logger log = new Logger();
        String txt = "";

        do {
            view.viewMenu();
            choice = view.getValue("Выберете действие: ");

            switch (choice) {

                case 1: {
                    SumModel model = new SumModel();
                    double a = view.getValue("Введите первое число: ");
                    model.setNum1(a);
                    double b = view.getValue("Введите второе число: ");
                    model.setNum2(b);
                    result = model.result();
                    txt = log.getExpression(a, b, result, choice);
                    System.out.println("Sum: " + result + "\n");
                    break;
                }
                case 2: {
                    SubstractionModel model = new SubstractionModel();
                    double a = view.getValue("Введите первое число: ");
                    model.setNum1(a);
                    double b = view.getValue("Введите второе число: ");
                    model.setNum2(b);
                    result = model.result();
                    txt = log.getExpression(a, b, result, choice);
                    System.out.println("Difference: " + result + "\n");
                    break;
                }
                case 3: {
                    MultiplyModel model = new MultiplyModel();
                    double a = view.getValue("Введите первое число: ");
                    model.setNum1(a);
                    double b = view.getValue("Введите второе число: ");
                    model.setNum2(b);
                    result = model.result();
                    txt = log.getExpression(a, b, result, choice);
                    System.out.println("Multiply: " + result + "\n");
                    break;
                }
                case 4: {
                    DivisionModel model = new DivisionModel();
                    double a = view.getValue("Введите первое число: ");
                    model.setNum1(a);
                    double b = view.getValue("Введите второе число: ");
                    model.setNum2(b);
                    result = model.result();
                    txt = log.getExpression(a, b, result, choice);
                    System.out.println("Division: " + result + "\n" + '\n');
                    break;
                }
                default: {
                    if (choice == 0) System.out.println("Возвращайтесь, когда понадобится!");
                    else System.out.println("Такого действия нет!\n");
                    break;
                }
            }
            log.writeFile(txt, "Logs.txt");
            txt = "";
        } while (choice != 0);
    }
}
