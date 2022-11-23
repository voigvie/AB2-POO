import java.util.ArrayList;
import java.util.Scanner;
public class App {
   public static void main(String[] args) {
      Market market = new Market();
      Scanner ler = new Scanner(System.in);
      PagamentoComum pagamentoComum = new PagamentoComum();
      PagamentoEMarket pagamentoEMarket = new PagamentoEMarket();
      ArrayList<Object> carrinho = new ArrayList<>();
      Section section;
      String res;
      Drinks DrinksSection;
      Food FoodSection;
      Hygiene HygieneSection;
      Cleaning CleaningSection;
      double total = 0;

      Drinks drinks = new Drinks();
      drinks.addBebida(new Refrigerante("Coca-Cola", 5.80));
      drinks.addBebida(new Refrigerante("Guarana", 4.50));
      drinks.addBebida(new Refrigerante("Fanta-Laranja", 6.55));
      drinks.addBebida(new Suco("Tang", 0.85));
      drinks.addBebida(new Suco("Dell Vale", 5.80));
      drinks.addBebida(new Suco("Tampico", 2.35));
      drinks.addBebida(new Vinho("Quinta do Morgado", 9.90));
      drinks.addBebida(new Vinho("Pergola", 18.55));
      drinks.addBebida(new Vinho("Cabernet", 26.91));

      Food foods = new Food();
      foods.addAlimento(new Carne("Friboi", 27.46));
      foods.addAlimento(new Carne("Sadia", 30.96));
      foods.addAlimento(new Carne("Seara", 28.50));
      foods.addAlimento(new Massa("Vitarela", 3.50));
      foods.addAlimento(new Massa("Massa-Leve", 5.75));
      foods.addAlimento(new Massa("Imperador", 2.80));
      foods.addAlimento(new Molho("Elefante", 5.80));
      foods.addAlimento(new Molho("Pomarola", 3.90));
      foods.addAlimento(new Molho("Tambaú", 2.25));
      
      Hygiene hygiene = new Hygiene();
      hygiene.addHigienePessoal(new Sabonete("Protex", 3.90));
      hygiene.addHigienePessoal(new Sabonete("Dove", 5.90));
      hygiene.addHigienePessoal(new Sabonete("Nívea", 4.40));
      hygiene.addHigienePessoal(new Shampoo("Pantene", 20.90));
      hygiene.addHigienePessoal(new Shampoo("Neutrox", 10.50));
      hygiene.addHigienePessoal(new Shampoo("Saloon-Line", 19.90));
      hygiene.addHigienePessoal(new CremeDental("Colgate", 10.50));
      hygiene.addHigienePessoal(new CremeDental("Even", 5.90));
      hygiene.addHigienePessoal(new CremeDental("Sorriso", 6.50));
      
      Cleaning cleaning = new Cleaning();
      cleaning.addLimpeza(new Sabao("Omo", 5.80));
      cleaning.addLimpeza(new Sabao("Ala", 2.45));
      cleaning.addLimpeza(new Sabao("Bem-Te-Vi", 3.40));
      cleaning.addLimpeza(new Detergente("Troia", 3.80));
      cleaning.addLimpeza(new Detergente("Polial", 2.20));
      cleaning.addLimpeza(new Detergente("Ypê", 2.99));
      cleaning.addLimpeza(new AguaSanitaria("Dragão", 2.69));
      cleaning.addLimpeza(new AguaSanitaria("Brilhante", 3.99));
      cleaning.addLimpeza(new AguaSanitaria("Troia", 4.50));
      

      market.addSection(1, drinks);
      market.addSection(2, foods);
      market.addSection(3, hygiene);
      market.addSection(4, cleaning);

       System.out.println("Bem vindo(a), ao E-Market, seu supermecado online");
       System.out.println("Selecione um número para começar suas compras:\n");
       System.out.println("------------MENU-------------");
       System.out.println("[1] Bebidas");
       System.out.println("[2] Alimentos");
       System.out.println("[3] Higiene Pessoal");
       System.out.println("[4] Limpeza");
       System.out.println("[5] Carrinho de Compras");
       System.out.println("[6] Pagar");
       System.out.println("[7] Sair");
       System.out.print("opção: ");

      while (true) {
         int op;
         int opc = Integer.parseInt(ler.next());
         switch (opc) {
            case 0:
               System.out.println("------------MENU-------------");
               System.out.println("[1] Bebidas");
               System.out.println("[2] Alimentos");
               System.out.println("[3] Higiene Pessoal");
               System.out.println("[4] Limpeza");
               System.out.println("[5] Carrinho de Compras");
               System.out.println("[6] Pagar");
               System.out.println("[7] Sair");
               System.out.print("opção: ");
               break;

            case 1:
               
               System.out.println("[1] Sucos");
               System.out.println("[2] Refrigerantes");
               System.out.println("[3] Vinhos");
               
               op = Integer.parseInt(ler.next());
               
               switch (op) {
                  case 0:
                     System.out.println("[1] Sucos");
                     System.out.println("[2] Refrigerantes");
                     System.out.println("[3] Vinhos");
                     
                     break;
                  
                  case 1:
                  section = market.getSection(1);

                  DrinksSection = ((Drinks) section);
   
                  for (int i = 0; i < DrinksSection.getBebidas().size(); i++) {
                     if (DrinksSection.getBebidas().get(i) instanceof Suco) {
                        System.out.println(DrinksSection.getBebidas().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < DrinksSection.getBebidas().size(); i++) {
                          if (DrinksSection.getBebidas().get(i) instanceof Suco) {
                              if (((Suco) DrinksSection.getBebidas().get(i)).marca.equals(res)) {
                                  carrinho.add(DrinksSection.getBebidas().get(i));
                                  total += ((Suco) DrinksSection.getBebidas().get(i)).preco;
                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                  break;

                  case 2:
                  section = market.getSection(1);

                  DrinksSection = ((Drinks) section);
   
                  for (int i = 0; i < DrinksSection.getBebidas().size(); i++) {
                     if (DrinksSection.getBebidas().get(i) instanceof Refrigerante) {
                        System.out.println(DrinksSection.getBebidas().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < DrinksSection.getBebidas().size(); i++) {
                          if (DrinksSection.getBebidas().get(i) instanceof Refrigerante) {
                              if (((Refrigerante) DrinksSection.getBebidas().get(i)).marca.equals(res)) {
                                  carrinho.add(DrinksSection.getBebidas().get(i));
                                  total += ((Refrigerante) DrinksSection.getBebidas().get(i)).preco;
                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                  break;

                  case 3:
                  section = market.getSection(1);

                  DrinksSection = ((Drinks) section);
   
                  for (int i = 0; i < DrinksSection.getBebidas().size(); i++) {
                     if (DrinksSection.getBebidas().get(i) instanceof Vinho) {
                     System.out.println(DrinksSection.getBebidas().get(i));
                     }
                  }

                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                  res = ler.next();
                  for (int i = 0; i < DrinksSection.getBebidas().size(); i++) {
                     if (DrinksSection.getBebidas().get(i) instanceof Vinho) {
                        if(((Vinho)DrinksSection.getBebidas().get(i)).marca.equals(res)){
                           carrinho.add(DrinksSection.getBebidas().get(i));
                           total += ((Vinho) DrinksSection.getBebidas().get(i)).preco;
                        }
                     }
                  }
                  System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                  }
                  break;
                  default:
                     break;
               }
               break;

            case 2:
                
               System.out.println("[1] Massas");
               System.out.println("[2] Molhos");
               System.out.println("[3] Carnes");
               
               op = Integer.parseInt(ler.next());
               
               switch (op) {
                   case 0:
                       System.out.println("[1] Massas");
                       System.out.println("[2] Molhos");
                       System.out.println("[3] Carnes");
                     
                     break;
                  
                  case 1:
                  section = market.getSection(2);

                  FoodSection = ((Food) section);
   
                  for (int i = 0; i < FoodSection.getAlimentos().size(); i++) {
                     if (FoodSection.getAlimentos().get(i) instanceof Massa) {
                        System.out.println(FoodSection.getAlimentos().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < FoodSection.getAlimentos().size(); i++) {
                          if (FoodSection.getAlimentos().get(i) instanceof Massa) {
                              if (((Massa) FoodSection.getAlimentos().get(i)).marca.equals(res)) {
                                  carrinho.add(FoodSection.getAlimentos().get(i));
                                  total += ((Massa) FoodSection.getAlimentos().get(i)).preco;
                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                  break;

                  case 2:
                  section = market.getSection(2);

                  FoodSection = ((Food) section);
   
                  for (int i = 0; i < FoodSection.getAlimentos().size(); i++) {
                     if (FoodSection.getAlimentos().get(i) instanceof Molho) {
                        System.out.println(FoodSection.getAlimentos().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < FoodSection.getAlimentos().size(); i++) {
                          if (FoodSection.getAlimentos().get(i) instanceof Molho) {
                              if (((Molho) FoodSection.getAlimentos().get(i)).marca.equals(res)) {
                                  carrinho.add(FoodSection.getAlimentos().get(i));
                                  total += ((Molho) FoodSection.getAlimentos().get(i)).preco;
                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                  break;

                  case 3:
                      section = market.getSection(2);

                      FoodSection = ((Food) section);

                      for (int i = 0; i < FoodSection.getAlimentos().size(); i++) {
                          if (FoodSection.getAlimentos().get(i) instanceof Carne) {
                              System.out.println(FoodSection.getAlimentos().get(i));
                          }
                      }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < FoodSection.getAlimentos().size(); i++) {
                          if (FoodSection.getAlimentos().get(i) instanceof Carne) {
                              if (((Carne) FoodSection.getAlimentos().get(i)).marca.equals(res)) {
                                  carrinho.add(FoodSection.getAlimentos().get(i));
                                  total += ((Carne) FoodSection.getAlimentos().get(i)).preco;

                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                      break;
                      default:
                     break;
               }
               break;

            case 3:
                  
               System.out.println("[1] Sabonetes");
               System.out.println("[2] Shampoos");
               System.out.println("[3] Cremes Dentais");
               
               op = Integer.parseInt(ler.next());
               
               switch (op) {
                   case 0:
                       System.out.println("[1] Sabonetes");
                       System.out.println("[2] Shampoos");
                       System.out.println("[3] Cremes Dentais");
                     
                     break;
                  
                  case 1:
                  section = market.getSection(3);

                  HygieneSection = ((Hygiene) section);
   
                  for (int i = 0; i < HygieneSection.getHigienePessoal().size(); i++) {
                     if (HygieneSection.getHigienePessoal().get(i) instanceof Sabonete) {
                        System.out.println(HygieneSection.getHigienePessoal().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < HygieneSection.getHigienePessoal().size(); i++) {
                          if (HygieneSection.getHigienePessoal().get(i) instanceof Sabonete) {
                              if (((Sabonete) HygieneSection.getHigienePessoal().get(i)).marca.equals(res)) {
                                  carrinho.add(HygieneSection.getHigienePessoal().get(i));
                                  total += ((Sabonete) HygieneSection.getHigienePessoal().get(i)).preco;

                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                  break;

                  case 2:
                  section = market.getSection(3);

                  HygieneSection = ((Hygiene) section);
   
                  for (int i = 0; i < HygieneSection.getHigienePessoal().size(); i++) {
                     if (HygieneSection.getHigienePessoal().get(i) instanceof Shampoo) {
                        System.out.println(HygieneSection.getHigienePessoal().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < HygieneSection.getHigienePessoal().size(); i++) {
                          if (HygieneSection.getHigienePessoal().get(i) instanceof Shampoo) {
                              if (((Shampoo) HygieneSection.getHigienePessoal().get(i)).marca.equals(res)) {
                                  carrinho.add(HygieneSection.getHigienePessoal().get(i));
                                  total += ((Shampoo) HygieneSection.getHigienePessoal().get(i)).preco;

                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                  break;

                  case 3:
                      section = market.getSection(3);

                  HygieneSection = ((Hygiene) section);
   
                  for (int i = 0; i < HygieneSection.getHigienePessoal().size(); i++) {
                     if (HygieneSection.getHigienePessoal().get(i) instanceof CremeDental) {
                        System.out.println(HygieneSection.getHigienePessoal().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < HygieneSection.getHigienePessoal().size(); i++) {
                          if (HygieneSection.getHigienePessoal().get(i) instanceof CremeDental) {
                              if (((CremeDental) HygieneSection.getHigienePessoal().get(i)).marca.equals(res)) {
                                  carrinho.add(HygieneSection.getHigienePessoal().get(i));
                                  total += ((CremeDental) HygieneSection.getHigienePessoal().get(i)).preco;

                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                      break;
                      default:
                     break;
               }
               break;
            
            case 4:
                     
               System.out.println("[1] Detergente");
               System.out.println("[2] Água Sanitária");
               System.out.println("[3] Sabão");
               
               op = Integer.parseInt(ler.next());
               
               switch (op) {
                   case 0:
                       System.out.println("[1] Detergente");
                       System.out.println("[2] Água Sanitária");
                       System.out.println("[3] Sabão");
                     
                     break;
                  
                  case 1:
                  section = market.getSection(4);

                  CleaningSection = ((Cleaning) section);
   
                  for (int i = 0; i < CleaningSection.getLimpeza().size(); i++) {
                     if (CleaningSection.getLimpeza().get(i) instanceof Detergente) {
                        System.out.println(CleaningSection.getLimpeza().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < CleaningSection.getLimpeza().size(); i++) {
                          if (CleaningSection.getLimpeza().get(i) instanceof Detergente) {
                              if (((Detergente) CleaningSection.getLimpeza().get(i)).marca.equals(res)) {
                                  carrinho.add(CleaningSection.getLimpeza().get(i));
                                  total += ((Detergente) CleaningSection.getLimpeza().get(i)).preco;

                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                  break;

                  case 2:
                  section = market.getSection(4);

                  CleaningSection = ((Cleaning) section);
   
                  for (int i = 0; i < CleaningSection.getLimpeza().size(); i++) {
                     if (CleaningSection.getLimpeza().get(i) instanceof AguaSanitaria) {
                        System.out.println(CleaningSection.getLimpeza().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < CleaningSection.getLimpeza().size(); i++) {
                          if (CleaningSection.getLimpeza().get(i) instanceof AguaSanitaria) {
                              if (((AguaSanitaria) CleaningSection.getLimpeza().get(i)).marca.equals(res)) {
                                  carrinho.add(CleaningSection.getLimpeza().get(i));
                                  total += ((AguaSanitaria) CleaningSection.getLimpeza().get(i)).preco;

                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                  break;

                  case 3:
                  section = market.getSection(4);

                  CleaningSection = ((Cleaning) section);
   
                  for (int i = 0; i < CleaningSection.getLimpeza().size(); i++) {
                     if (CleaningSection.getLimpeza().get(i) instanceof Sabao) {
                        System.out.println(CleaningSection.getLimpeza().get(i));
                     }
                  }
                      System.out.println("Digite o nome do produto que deseja adicionar ao carrinho");
                      System.out.println("Ou digite 0 para voltar ao menu principal");

                      res = ler.next();
                      for (int i = 0; i < CleaningSection.getLimpeza().size(); i++) {
                          if (CleaningSection.getLimpeza().get(i) instanceof Sabao) {
                              if (((Sabao) CleaningSection.getLimpeza().get(i)).marca.equals(res)) {
                                  carrinho.add(CleaningSection.getLimpeza().get(i));
                                  total += ((Sabao) CleaningSection.getLimpeza().get(i)).preco;

                              }
                          }
                      }
                      System.out.println("\nCarrinho de compras:");
                      for (Object a : carrinho) {
                          System.out.print(a + "\n");
                      }
                      break;
               }
               break;
            case 5:
                System.out.println("\nCarrinho de compras:");
                for (Object a : carrinho) {
                    System.out.print(a + "\n");
                }
                break;
            case 6:
                System.out.println("\n------------PAGAR-------------");
                System.out.println("[1] Pagamento Comum");
                System.out.println("[2] Pagamento E-Market\n");

                op = Integer.parseInt(ler.next());
                switch (op) {
                    case 1:
                        pagamentoComum.pagar(total, carrinho);
                        break;
                    
                    case 2:
                        pagamentoEMarket.pagar(total, carrinho);
                        break;
                }
            
            case 7:
               ler.close(); 
               System.exit(1);
               break;
         }
      }
   }
}
