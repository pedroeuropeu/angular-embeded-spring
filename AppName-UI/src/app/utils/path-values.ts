import { environment } from "../../environments/environment";

const financesApi = environment.apis.apiWS;

/**USERS CONTROLLER*/
const ping = `${financesApi}api/ping`;

const pathValues = {
  ping,
};

export { pathValues };
