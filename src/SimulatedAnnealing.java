public class SimulatedAnnealing {

    // Calcula a probabilidade de aceitação
    public static double calculaProbabilidadeAceitacao(int energia, int novaEnergia, double temperatura) {

        // Se a nova solução é melhor, aceitá-la
        if (novaEnergia < energia) {
            return 1.0;
        }
        // Se a nova solução é pior, calcular a probabilidade de aceitação
        return Math.exp((energia - novaEnergia) / temperatura);
    }

    public static void main(String[] args{

        //Aqui instanciar meus registros de investimento

        double temperatura = 10;

        //para 100 iterações
        double taxaResfriamento = 0.1;

/*

        // Initialize intial solution
        Tour currentSolution = new Tour();
        currentSolution.generateIndividual();

        System.out.println("Initial solution distance: " + currentSolution.getDistance());

        // Set as current best
        Tour best = new Tour(currentSolution.getTour());

        // Loop until system has cooled
        while (temp > 1) {
            // Create new neighbour tour
            Tour newSolution = new Tour(currentSolution.getTour());

            // Get a random positions in the tour
            int tourPos1 = (int) (newSolution.tourSize() * Math.random());
            int tourPos2 = (int) (newSolution.tourSize() * Math.random());

            // Get the cities at selected positions in the tour
            City citySwap1 = newSolution.getCity(tourPos1);
            City citySwap2 = newSolution.getCity(tourPos2);

            // Swap them
            newSolution.setCity(tourPos2, citySwap1);
            newSolution.setCity(tourPos1, citySwap2);

            // Get energy of solutions
            int currentEnergy = currentSolution.getDistance();
            int neighbourEnergy = newSolution.getDistance();

            // Decide if we should accept the neighbour
            if (acceptanceProbability(currentEnergy, neighbourEnergy, temp) > Math.random()) {
                currentSolution = new Tour(newSolution.getTour());
            }

            // Keep track of the best solution found
            if (currentSolution.getDistance() < best.getDistance()) {
                best = new Tour(currentSolution.getTour());
            }

            // Cool system
            temp *= 1-coolingRate;
        }

        System.out.println("Final solution distance: " + best.getDistance());
        System.out.println("Tour: " + best);
    }

*/

        /*
        output

        Initial solution distance: 1966
        Final solution distance: 911
        Tour: |180, 200|200, 160|140, 140|180, 100|180, 60|200, 40|
*/

}
