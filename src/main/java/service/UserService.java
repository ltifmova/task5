package service;

import dto.Response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import repostory.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
        public List<UserResponse> findAll(){
            return userRepository
                    .findAll()
                    .stream()
                    .map(user -> modelMapper.map(user,UserResponse.class))
                    .collect(Collectors.toList());

        }
        public UserResponse findById(Long userId){
            User user= (User) userRepository.findById(userId).orElseThrow(()-> new RuntimeException(
                    String.format("user not found myid-%s",userId)
            ));
            return modelMapper.map(user,UserResponse.class);
        }
}
