import { Link } from "expo-router";
import { styled } from "nativewind";
import { Image, Pressable } from "react-native";

const StyledPressable = styled(Pressable);

export default function ImgRounded({src}) {
  return (
    <Link href={"/Hero"} asChild>
      <StyledPressable className="mx-2 rounded-full border border-black">
        <Image 
          className="w-12 h-12 rounded-full"
          source={src}
        />  
      </StyledPressable>
    </Link>
  );
}