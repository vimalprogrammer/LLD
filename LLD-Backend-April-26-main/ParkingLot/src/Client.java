import controller.TokenController;
import dto.request.IssueTokenRequest;
import dto.response.IssueTokenResponse;
import model.VehicleType;
import repository.GateRepository;
import repository.ParkingLotRepo;
import repository.VehicleRepository;
import service.TokenService;

public class Client {

    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepo parkingLotRepo = new ParkingLotRepo();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TokenService tokenService = new TokenService(gateRepository,parkingLotRepo,vehicleRepository);
        TokenController tokenController = new TokenController(tokenService);

        IssueTokenRequest issueTokenRequest = new IssueTokenRequest("Virat","DL08GH3", VehicleType.FOUR_WHEELER,1,10);
        IssueTokenResponse response = tokenController.issueToken(issueTokenRequest);

        System.out.println(response.getMessage());
        System.out.println(response.getStatus());
    }
}
